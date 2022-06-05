# Demo01

遇到问题：
1. 提示找不到数据库的url字段
   > application.yml文件命名错误导致
2. 找不到数据库的驱动包
   > 未导入 mysql-connector-java包导致
3. 找不到 UserMapper的接口类
   > UserMapper.xml和UserMapper.java的目录结构不一致，UserMapper.xml目录层级全是*.*，编译器创建的时候导致的问题
4. 启动后，报错 “client_plugin_auth is required”
   > 数据库版本 和 mysql-connector-java 包的版本不一致导致
5. 