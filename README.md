
# bill records

1. practice.


## 操作记录

1. 安装mariaDB

        ① yum install mariadb mariadb-server
        ② 测试成功安装与否: systemctl start mariadb
        ③ 安全配置mariaDB
                
                ① mysql_secure_installation
                ② 根据英文提示，选择删除无用表，root仅local登录，设置root密码等等操作
                
         ④ 创建一个项目DB: create database testdemo
         ⑤ 创建项目远程可访问用户，并赋权:
                
                ① create user demouser identified by 'demouserpwd';
                ② grant select,update,delete,insert,alter on testdemo.* to demouser;
         ⑥ 查看权限赋值是否成功: show grants for demouser;
         ⑦ 刷新下权限: flush privileges;
         
   **云服务器记得开启入网与出网的安全策略配置，否则远程连接mariaDB时，会denied**

2. 设计表结构
                    