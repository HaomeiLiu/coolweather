# coolweather

根据郭霖《第一行代码》创建的demo

因为版本更新，两个需要修改的地方：
- Android Network Security Policy update, 访问http网站需要在``network_security_config.xml``中注册域名，并在``menifest``中注册
- DrawerLayout, SwipeRefreshLayout 等作者用到android widget要变成androidx
