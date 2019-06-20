# simple-microservice
简单的微服务

## 部署须知 ##
  * 1.首先需要导入doc/db里面的数据库到自己的mysql
  * 2.修改部署的环境application.yml 里面的active配置为fat
  * 3.修改数据库配置，只需要修改application-fat.yml的数据库即可
  * 4.打包顺序，mvn install common项目
  * 4.启动顺序：注册中心——网关——商品服务——库存服务——订单服务