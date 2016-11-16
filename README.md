本服务示例为：接入Dubbo,和Cat的示例。具体搭建过程参：https://czwer.github.io/2016/11/10/%E5%85%AC%E5%8F%B8%E5%9F%BA%E7%A1%80%E8%AE%BE%E6%96%BD%E6%90%AD%E5%BB%BA/

	1.目录介绍：
		exmaple-service-api：定义接口，方便其他工程引用，会打成jar包，部署私服供其他项目引用
		exmaple-serivce-biz：业务逻辑实现层，部署编译后，会在exmpale-service-pulish中引用；
		exmaple-service-client：可以独立测试使用
		exmaple-service-pulish：发布的应用，会最终打包为war部署
	2.使用前请替换example-service中pom.xml中定义的<parent>为自建私服中的全局pom
	3.请修改数据库配置（IP，账户，密码）：example-service/example-service-biz/src/main/resources/data.properties
	4.修改dubbo配置（zookeeper地址，log位置）：
		example-service/example-service-biz/src/main/resources/dubbo.properties（依赖的服务配置）
		example-service/example-service-client/src/test/resources/dubbo.properties（测试依赖的服务配置）
		example-service/example-service-publish/src/main/resources/dubbo.properties（发布的服务配置）
	5.修改日志位置：
		example-service/example-service-client/src/test/resources/log4j.properties
		example-service/example-service-publish/src/main/resources/log4j.properties
		