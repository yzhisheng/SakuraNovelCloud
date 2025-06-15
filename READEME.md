
## 项目背景

小说网站业务难度适中，没有商城系统那种复杂的业务。但是作为互联网项目，一样需要面对大规模用户和海量数据的处理，所以高并发、高可用、高性能、高容错、可扩展性、可维护性也是小说网站设计需要考虑的问题，商城系统中所用到的技术同样适用于小说网站。

综上所述，使用微服务架构来构建一个小说门户平台是非常有必要的，利用微服务构建的小说门户平台来学习现下流行技术相较于业务比较复杂的商城系统来说也是比较容易的。


## 开发环境

- MySQL 8.0
- Redis 7.0
- Elasticsearch 8.6.2
- RabbitMQ 3.x
- XXL-JOB 2.3.1
- Nacos 2.2.1
- JDK 17
- Maven 3.8
- Node 16.14

## 后端技术选型

| 技术                   |      版本      | 说明                                | 官网                               |                                                              学习                                                               |
|----------------------|:------------:|-----------------------------------| -------------------------------------- |:-----------------------------------------------------------------------------------------------------------------------------:|
| Spring Cloud         |   2023.0.3   | 微服务开发的一站式解决方案                     | [进入](https://spring.io/projects/spring-cloud) |                              [进入](https://docs.spring.io/spring-cloud/docs/current/reference/html/)                               |
| Spring Cloud Alibaba |  2023.0.1.2  | 阿里巴巴贡献的 Spring Cloud 微服务开发一站式解决方案 | [进入](https://github.com/alibaba/spring-cloud-alibaba) |                              [进入](https://spring-cloud-alibaba-group.github.io/github-pages/2021/zh-cn/2021.0.5.0/index.html)                               |
| Nacos                |    2.2.1     | 服务发现和配置管理                         | [进入](https://nacos.io)  |                              [进入](https://nacos.io/zh-cn/docs/what-is-nacos.html)                               |
| Spring Boot Admin    |    3.3.5     | 微服务管理和监控                          | [进入](https://github.com/codecentric/spring-boot-admin)                |                                [进入](https://codecentric.github.io/spring-boot-admin/3.0.0-M1)                                 |
| Spring Boot          |    3.3.5     | 容器 + MVC 框架                       | [进入](https://spring.io/projects/spring-boot) |                              [进入](https://docs.spring.io/spring-boot/docs/3.0.0/reference/html)                               |
| MyBatis              |    3.0.3     | ORM 框架                            | [进入](http://www.mybatis.org)                |                                       [进入](https://mybatis.org/mybatis-3/zh/index.html)                                       |
| MyBatis-Plus         |   3.5.3.1    | MyBatis 增强工具                      | [进入](https://baomidou.com/)                 |                                           [进入](https://baomidou.com/pages/24112f/)                                            |
| JJWT                 |    0.9.1     | JWT 登录支持                          | [进入](https://github.com/jwtk/jjwt)          |                                                               -                                                               |
| Lombok               |   1.18.38    | 简化对象封装工具                          | [进入](https://github.com/projectlombok/lombok) |                                         [进入](https://projectlombok.org/features/all)                                          |
| Caffeine             |    3.1.0     | 本地缓存支持                            | [进入](https://github.com/ben-manes/caffeine)              |                                  [进入](https://github.com/ben-manes/caffeine/wiki/Home-zh-CN)                                  |
| Redis                |     7.0      | 分布式缓存支持                           | [进入](https://redis.io)                 |                                                  [进入](https://redis.io/docs)                                                  |
| Redisson             |    3.45.0    | 分布式锁实现                            | [进入](https://github.com/redisson/redisson)                 |                              [进入](https://github.com/redisson/redisson/wiki/%E7%9B%AE%E5%BD%95)                               |
| RabbitMQ             |     3.x      | 开源消息中间件                           | [进入](https://www.rabbitmq.com)                 |                                [进入](https://www.rabbitmq.com/tutorials/tutorial-one-java.html)                                |
| MySQL                |     8.x      | 数据库服务                             | [进入](https://www.mysql.com)                 |                       [进入](https://docs.oracle.com/en-us/iaas/mysql-database/doc/getting-started.html)                        |
| ShardingSphere-JDBC  |    5.4.1     | 数据库分库分表支持                         | [进入](https://shardingsphere.apache.org)                 |                              [进入](https://shardingsphere.apache.org/document/5.1.1/cn/overview)                               |
| Elasticsearch        |    8.6.2     | 搜索引擎服务                            | [进入](https://www.elastic.co)                 |                       [进入](https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html)                        |
| XXL-JOB              |    2.3.1     | 分布式任务调度平台                         | [进入](https://www.xuxueli.com/xxl-job)                 |                                             [进入](https://www.xuxueli.com/xxl-job)                                             |
| Springdoc-openapi    |    2.6.0     | Swagger 3 接口文档自动生成                | [进入](https://github.com/springdoc/springdoc-openapi)                |                                                 [进入](https://springdoc.org/)                                                  |
| Undertow             |    3.3.5     | Java 开发的高性能 Web 服务器               | [进入](https://undertow.io) |                                         [进入](https://undertow.io/documentation.html)                                          |

**注：更多热门新技术待集成。**

## 前端技术选型

| 技术               |    版本     | 说明                              | 官网                             | 学习资源                          |
| :----------------- | :--------: | --------------------------------- |--------------------------------| :-------------------------------: |
| Vue.js             |   **3.6**  | 渐进式 JavaScript 框架            | [官网](https://vuejs.org)        | [教程](https://staging-cn.vuejs.org/guide/introduction.html) |
| Vue Router         |   **4.3**  | Vue.js 的官方路由                 | [官网](https://router.vuejs.org) | [指南](https://router.vuejs.org/zh/guide/) |
| axios              |  1.6.2+    | 基于 Promise 的 HTTP 客户端       | [官网](https://axios-http.com)   | [文档](https://axios-http.com/zh/docs/intro) |
| Element Plus       |  **3.4+**  | Vue 3 组件库（支持暗黑模式/虚拟表格）| [官网](https://element-plus.org) | [指南](https://element-plus.org/zh-CN/guide/design.html) |
| **Vite**           |  **6.0+**  | **下一代前端构建工具**（闪电冷启动/高效 HMR） | [官网](https://vitejs.dev)      | [中文文档](https://cn.vitejs.dev/guide/) |


## 项目架构

~~~
com.sakura.novel     
├── novel-ui              // 后台前端框架 [80]
├── novel-gateway         // 网关模块 [8080]
├── novel-auth            // 认证中心 [9200]
├── novel-api             // 接口模块
│       └── novel-api-system                          // 系统接口
├── novel-common          // 通用模块
│       └── novel-common-core                         // 核心模块
│       └── novel-common-datascope                    // 权限范围
│       └── novel-common-datasource                   // 多数据源
│       └── novel-common-log                          // 日志记录
│       └── novel-common-redis                        // 缓存服务
│       └── novel-common-rabbit                       // 消息队列服务
│       └── novel-common-seata                        // 分布式事务
│       └── novel-common-security                     // 安全模块
│       └── novel-common-sensitive                    // 数据脱敏
│       └── novel-common-swagger                      // 系统接口
├── novel-modules         // 业务模块
│       └── novel-system                              // 系统模块 [9201]
│       └── novel-gen                                 // 代码生成 [9202]
│       └── novel-job                                 // 定时任务 [9203]
│       └── novel-file                                // 文件服务 [9300]
├── novel-visual          // 图形化管理模块
│       └── novel-visual-monitor                      // 监控中心 [9100]
├──pom.xml                // 公共依赖
~~~

# 前端运行
## 克隆项目
git clone https://github.com/yangzongzhuan/RuoYi-Cloud-Vue3.git

## 进入项目目录
cd RuoYi-Cloud-Vue3

## 安装依赖
yarn --registry=https://registry.npmmirror.com

## 启动服务
yarn dev

## 构建测试环境 yarn build:stage
## 构建生产环境 yarn build:prod
## 前端访问地址 http://localhost:80
