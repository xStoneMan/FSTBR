//public static String url = "http://60.205.83.27/router/rest"; //接口地址
//public static String appkey="10000005"; //AppKey
//public static String appSecret="b65025d0-19d2-4841-88f4-ff4439b8da58"; //AppSecrect
//public static String userName="admin_1800000021168"; //用户名
//public static String password="123456"; //密码
//public static String userSalt="94db610c5c3049df8da3e9ac91390015"; //盐值
//
//class TestFaPiao {
//    public static void main(String[] args) {
//        try {
//            LoginRequest loginRequest = new LoginRequest();
//            loginRequest.setAppkey(appkey);
//            loginRequest.setAppSecret(appSecret);
//            loginRequest.setUserName(userName);
//            loginRequest.setPasswordMd5(password);
//            loginRequest.setUserSalt(userSalt);
//            ILoginClient loginClient = new PostLogin(url);
//            LoginResponse loginResponse = loginClient.login(loginRequest);
//            String token=loginResponse.getAccess_token();//获取token
//            InvoiceOpenRequest request = new InvoiceOpenRequest();
//            request.setSellerTaxNo(Contants.sellerTaxNo);
//            request.setDeviceType(Contants.deviceType);
//            request.setOrganizationCode("");
//            request.setSerialNo(Contants.serialNo);
//            request.setInvoiceSpecialMark("00");
//            request.setInvoiceTypeCode(Contants.invoiceTypeCode);
//            request.setInvoiceTerminalCode(Contants.invoiceTerminalCode);
//            request.setBuyerTaxNo("");
//            request.setBuyerName("百望股份有限公司");
//            request.setBuyerAddressPhone("");
//            request.setBuyerBankAccount("");
//            request.setDrawer("wwm");
//            request.setChecker("");
//            request.setPayee("");
//            request.setInvoiceType("0");
//            request.setInvoiceListMark("0");
//            request.setRedInfoNo("");
//            request.setOriginalInvoiceCode("");
//            request.setOriginalInvoiceNo("");
//            request.setTaxationMode("0");
//            request.setDeductibleAmount("");
//            request.setInvoiceTotalPrice("200.00");
//            request.setInvoiceTotalTax("34.00");
//            request.setInvoiceTotalPriceTax("234.00");
//            request.setSignatureParameter("0000004282000000");
//            request.setTaxDiskNo("");
//            request.setTaxDiskKey("");
//            request.setTaxDiskPassword("");
//            request.setGoodsCodeVersion("");
//            request.setConsolidatedTaxRate("");
//            request.setNotificationNo("");
//            request.setRemarks("备注");
//            // request.setAutoSplit(true); /** AutoSplit=true时，返回为list，见下方Response示例 **/
//            List<InvoiceDetails> invoiceDetailsList = new ArrayList<InvoiceDetails>();
//            InvoiceDetails invoiceDetails = new InvoiceDetails();
//            invoiceDetails.setGoodsLineNo("1");
//            invoiceDetails.setGoodsLineNature("0");
//            invoiceDetails.setGoodsCode("1020101000000000000");
//            invoiceDetails.setGoodsExtendCode("");
//            invoiceDetails.setGoodsName("ww");
//            invoiceDetails.setGoodsTaxItem("");
//            invoiceDetails.setGoodsSpecification("");
//            invoiceDetails.setGoodsUnit("");
//            invoiceDetails.setGoodsQuantity("");
//            invoiceDetails.setGoodsPrice("");
//            invoiceDetails.setGoodsTotalPrice("200.00");
//            invoiceDetails.setGoodsTotalTax("34.00");
//            invoiceDetails.setGoodsTaxRate("0.17");
//            invoiceDetails.setGoodsDiscountLineNo("");
//            invoiceDetails.setPriceTaxMark("0");
//            invoiceDetails.setVatSpecialManagement("");
//            invoiceDetails.setFreeTaxMark("");
//            invoiceDetails.setPreferentialMark("0");
//            invoiceDetailsList.add(invoiceDetails);
//            request.setInvoiceDetailsList(invoiceDetailsList);
//            IBopClient client = new BopRestClient(url, appkey, appSecret);
//            InvoiceOpenResponse response = client.execute(request, token,
//            InvoiceOpenResponse.class);
//            // autoSplit = true时, 使用 InvoiceOpenAutoSplitResponse 接收
//            // InvoiceOpenAutoSplitResponse response =
//            // client.execute(request, token, InvoiceOpenAutoSplitResponse.class);
//        } catch (BopException e) {
//            log.info(e.getErrCode());
//            log.info(e.getErrMsg());
//            log.info(e.getSubMessage());
//            log.info(e.getSubCode());
//            log.info(e.getMessage());
//        }
//    }
//}