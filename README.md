# FSTBR
The first step to becoming rich

# Auto generate mybatis code and relates controller,domain and service
## Configuration mysql
### application.yml
fixed the datasource.url to your database
## call the controller GeneratorController
### generatorAll means generate all the table from the database you configure
### Controller in Controller dir
### Dao in Dao dir
### table entity in Domain.Model dir
### db service query function interface in Service.Service
### db service query function implement in Service.Implement
### related mappers in resources.mappers
