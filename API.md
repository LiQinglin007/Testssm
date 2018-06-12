### 接口说明
code:200 成功   100失败<br>

msg:接口说明<br>

BaseUrl:http://lixiaomi007.xicp.cn:12542/

#### 1.登录接口<br>

函数调用地址：User/login <br>

函数描述:登录<br>

函数入参：<br>
```
"userName":"bobo"，String  		(必传)
"password":"12345678"   String			(必传)
```
函数出参：
```
{
    "code":200,
    "data":{
        "userMenu":[
            {
                "menuId":5,
                "menuName":"增加球员"
            },
            {
                "menuId":6,
                "menuName":"删除球员"
            }
        ],
        "userType":"4",
        "userId":4
    },
    "msg":"登录成功"
}
```

#### 2.查询全部<br>

函数调用地址：ChampionTeamController/selectAll <br>

函数描述:获取冠军球队列表<br>

函数入参：<br>
```
无入参
```
函数出参：
```
{
    "code":200,
    "data":[
        {
            "teamid":16,
            "teamname":"76人"
        },
        {
            "teamid":19,
            "teamname":"勇士"
        }
    ],
    "msg":"查询成功"
}
```


#### 3.添加冠军球队<br>

函数调用地址：ChampionTeamController/addChampionTeam <br>

函数描述:添加冠军球队<br>

函数入参：<br>
```
"teamName":"球队名称"，String  		(必传)
```
函数出参：
```
{
    "code":200,
    "data":null,
    "msg":"添加成功"
}
```


#### 4.修改冠军球队名称<br>

函数调用地址：ChampionTeamController/updateChampionTeam <br>

函数描述:修改冠军球队名称<br>

函数入参：<br>
```
"teamId":"球队id"，String  		(必传)
"teamName":"球队名称"，String  		(必传)
```
函数出参：
```
{
    "code":200,
    "data":null,
    "msg":"修改成功"
}

```


#### 5.删除冠军球队<br>

函数调用地址：ChampionTeamController/deleteChampionTeam <br>

函数描述:删除冠军球队<br>

函数入参：<br>
```
"teamId":"球队id"，String  		(必传)
```
函数出参：
```
{
    "code":200,
    "data":null,
    "msg":"删除成功"
}

```
