package com.fstbr.demo.Controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fstbr.demo.Entity.Result;
import com.fstbr.demo.Utils.DateUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

@RestController
@RequestMapping("/api/test")
public class IndexController {

    /**
     * 创建新的数据
     * @param jsonObject
     * @return
     */
    private JSONObject addDataToJsonObject(JSONObject jsonObject) {
        JSONObject jsonObject1 = new JSONObject();

        JSONObject attr = jsonObject.getJSONObject("attributes");
        jsonObject1.put("photoTime", jsonObject.getString("photoTime"));
        jsonObject1.put("age", attr.getInteger("age"));
        jsonObject1.put("gender", attr.getString("gender"));
        jsonObject1.put("id", jsonObject.getString("id"));
        jsonObject1.put("faceUri", jsonObject.getString("faceUri"));

        return jsonObject1;
    }

    /**
     * 比对数据时间
     * @param faceData
     * @return
     */
    private JSONArray calculateFaces(JSONArray faceData) {

        JSONArray jsonArray = new JSONArray();
        Date baseDate = null;
        for (int i = 0; i < faceData.size(); ++i) {
            JSONObject jsonObject = faceData.getJSONObject(i);
            if (baseDate != null) {
                Calendar beforeInstance = Calendar.getInstance();
                beforeInstance.setTime(baseDate);
                beforeInstance.add(Calendar.HOUR, 1);

                Date beforeDate = beforeInstance.getTime();
                Date afterDate = DateUtils.UTCToCNDate(jsonObject.getString("photoTime"), "yyyy-MM-dd HH:mm:ss");

                baseDate = afterDate;

                if (beforeDate.after(afterDate)) {
                    continue;
                }

            } else {
                baseDate = DateUtils.UTCToCNDate(jsonObject.getString("photoTime"), "yyyy-MM-dd HH:mm:ss");
            }

            // 进行添加
            JSONObject tempJsonObject = this.addDataToJsonObject(jsonObject);
            jsonArray.add(tempJsonObject);
        }

        return jsonArray;
    }

    /**
     * attempToTest
     * @param jsonObject
     * @return
     */
    @PostMapping("/generate")
    public Result<Object> test(@RequestBody JSONObject jsonObject) {

        // 取出result
        JSONObject data = jsonObject.getJSONObject("data");
        JSONArray tempResults = data.getJSONArray("results");

        // 构造返回数据
        JSONArray resultMsg = new JSONArray();

        // 取出每一个selectedFaces
        for (int i = 0; i < tempResults.size(); ++i) {
            JSONObject tempJsonObject = tempResults.getJSONObject(i);
            JSONArray tempFaces = tempJsonObject.getJSONArray("selectedFaces");

            // 优先排序
            tempFaces.sort(Comparator.comparing(obj -> ((JSONObject) obj).getString("photoTime")));

            // 获取
            JSONArray tempResult = this.calculateFaces(tempFaces);

            resultMsg.add(tempResult);
        }

        return Result.success(resultMsg);
    }
}
