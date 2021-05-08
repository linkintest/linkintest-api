### **Linkin Test API Document**

[![alt text](https://images.gitee.com/uploads/images/2021/0508/154417_7e50761e_9074351.jpeg)](http://linkintest.com)

### Product introduction

```java
Linkintest is an advanced verification tool mainly for CPI Campaigns. 
You can check out the status of target campaigns and then stop wasting clicks on non-working campaigns. 
It also allows you to see how many competitors are involved so as to make a decision. 
```

### Authentication

```java
There is one authentication methods for the API: HTTP Basic authentication .
The easiest way to authenticate is using HTTP Basic authentication.
Enter Api Name as your username and supply your API Key as the password.
```

### **Method**

| HTTP Method | Endpoint      |
| ----------- | ------------- |
| POST        | /detector/url |

### **Request Body Parameters**

| Field       | Type   | Description                                                  | Nullable |
| ----------- | ------ | ------------------------------------------------------------ | -------- |
| testLink    | string | test link                                                    | Yes      |
| countryCode | string | test link by country      :AE                                | Yes      |
| cityCode    | string | test link by city    :Abadilah                               | No       |
| carrierCode | string | test link by carrierCode   : etisalat                        | No       |
| os          | string | test link by os  : android/ios                               | No       |
| osVersion   | string | test link by osVersion  : 10.0                               | No       |
| previewLink | int    | the link Jump destination :https://apps.apple.com/hk/app/id1276449806 | No       |
| appId       | string | the link Jump Credentials for successful detection           | No       |

### Response body parameters

| Field         | Type    | Description                                                  |
| ------------- | ------- | ------------------------------------------------------------ |
| code          | int     | A code of 0 indicates a successful response to the request   |
| messsage      | String  | If message is success, the request response is successful    |
| data          | object  | The result returned by the linktest probe                    |
| testLink      | String  | test link                                                    |
| country       | String  | test link by country      :AE                                |
| targetLink    | String  | the link Jump destination :https://apps.apple.com/hk/app/id1276449806 |
| osVersion     | String  | test link by osVersion  : 10.0                               |
| packageMatch  | boolean | detect the mark of success   : true/false                    |
| hasTimeout    | boolean | detect  timeout  ：true/false                                |
| redirectLevel | int     | The level of jump excludes third-party attribution links and store links : 2 |
| requestTime   | long    | the detect request time :1620380166                          |
| credit        | int     | Points of consumption : 1                                    |
| trackStatus   | boolean | The destination link status code is 200 :ture/false          |
| redirectUrl   | array   | the detect result detail include url and status              |

```java
{
    "code": 0,
    "message": "success",
    "data": {
        "testLink": "http://tracking.leomob.com/track?awno=lm157&oid=3141635",
        "country": CN,
        "os": "IOS",
        "appId": "id127644980",
        "targetLink": "https://apps.apple.com/hk/app/id1276449806",
        "osVersion": "",
        "packageMatch": true,
        "hasTimeout": 0,
        "redirectLevel": 2,
        "requestTime": 1620380166,
        "credit": 1,
        "trackStatus": true,
        "redirectUrl": [
            "{\"url\":\"http://tracking.leomob.com/track?awno=lm157&oid=3141635\",\"status\":302}",
            "{\"url\":\"https://apps-meg.com/qnx?lpid=-1&oid=100182&pid=29159&pubref=postback1048150cc%257B%2522awno%2522%253A%2522lm157%2522%252C%2522oid%2522%253A%25223141635%2522%252C%2522payout%2522%253A%252296.5000%2522%252C%2522channelPayout%2522%253A%252286.85%2522%257D&affpubid=lm157n0&sitename=&iosidfa=\",\"status\":302}",
            "{\"url\":\"https://app.appsflyer.com/id1276449806?af_siteid=29159_lm157n0&af_c_id=100182&af_sub1=100182&af_sub2=29159&af_sub_siteid=lm157n0&pid=applift_int&c=3rd_anniversary&af_click_lookback=7d&clickid=179462f331d0d1bo2ca5dod21770300e99&idfa=&af_ad=&af_ad_id=&af_ua=Mozilla%2F5.0%20%28iPhone%3B%20CPU%20iPhone%20OS%2013_3%20like%20Mac%20OS%20X%29%20AppleWebKit%2F605.1.15%20%28KHTML%2C%20like%20Gecko%29%20CriOS%2F80.0.3987.95%20Mobile%2F15E148%20Safari%2F604.1&af_ip=32.42.161.224&goalid_1=hy62f&goalid_2=kgwo3&goalid_3=zlcoh&goalid_4=cedcs&goalid_8=dzlft&goalid_9=alltac&goalid_10=dy5lk&goalid_11=yhr2y&tsp=182877&drc=MQ==\",\"status\":200}",
            "{\"url\":\"https://apps.apple.com/HK/app/id1276449806?mt=8\",\"status\":301}",
            "{\"url\":\"https://apps.apple.com/HK/app/id1276449806?mt=8\",\"status\":200}"
        ]
    }
}
```

### **Example request**

```java
Request POST :http://api.linkintest.com/detector/url
authentication 
	username:linkintest@163.com
	password:4a59ee5cea8xx62ccfxxxx4a3ba54c49
body:
   {
    "appId": "id123567890",
    "countryCode": "94",
    "os": "iOS",
    "previewLink": "https://apps.apple.com/hk/app/id1234567890",
    "testLink": "http://www.baidu.com/track?awno=lmasdf&oid=123123" 
	}
```

[^tip]: When you register on the linktest website, the user name is your email address, and the password can be found from the API key

**Get your username(Email)**

![输入图片说明](https://images.gitee.com/uploads/images/2021/0508/114423_12f2b9df_9074351.png "image-20210508095251113.png")

**Get your password(Linkin Test API KEY)**

![输入图片说明](https://images.gitee.com/uploads/images/2021/0508/114452_e2337540_9074351.png "image-20210508095205383.png")

[^tip]: You need to input IP. Only the IP added to the white list has access to the API 

#### POSTMAN

 **Fill in the requested authentication information** 

![输入图片说明](https://images.gitee.com/uploads/images/2021/0508/114511_2d2975e5_9074351.png "image-20210508102033177.png")

**Fill in the request body information**

![输入图片说明](https://images.gitee.com/uploads/images/2021/0508/151419_bfcb43bf_9074351.jpeg "Dingtalk_20210508151245.jpg")

**Authentication information can also be accessed through the header mode**

![输入图片说明](https://images.gitee.com/uploads/images/2021/0508/114538_909eabd1_9074351.png "image-20210508102528732.png")

[^tip]: The authentication header information can be passed through the username:password Do Base64

#### **JAVA**

```java
public class LinkinTestRequestDemo {
    /**
    please input USERNAME、PASSWORD、BODY
    /**
    public static final String URL = "http://api.linkintest.com/detector/url";
    public static final String REQUEST_METHOD = "POST";
    public static final String USERNAME = "your username";
    public static final String PASSWORD = "your password";
    public static final String BODY =
                    "{\n" +
                    "    \"appId\": \"id1234567890\",\n" +
                    "    \"countryCode\": \"HK\",\n" +
                    "    \"previewLink\": \"https://apps.apple.com/hk/app/id1234567890\",\n" +
                    "    \"testLink\": \"http://www.baidu.com/track?awno=lmasdf&oid=123123\"\n" +
                    "}";

    public static void main(String[] args) {
        HttpRequest request = new HttpRequest();
        request.method(REQUEST_METHOD);
        request.set(URL);
        Map<String, String> headers = Maps.newHashMap();
        String authorization = "Basic ".concat(Base64.encode(USERNAME.concat(":").concat(PASSWORD)));
        headers.put("Authorization", authorization);
        request.header(headers);
        request.header("Content-Type", MediaType.APPLICATION_JSON_UTF8_VALUE);
        request.body(BODY);
        request.connectionTimeout(60000);
        request.timeout(120000);
        HttpResponse response = request.send();
        System.out.println(response.body());
    }
}
```

#### PHP

```php
<?php
    //please input $userName、$password、$body 
    $url = "http://api.linkintest.com/detector/url";
    $userName = "username";
    $password = "password";
    $token = base64_encode("$userName:$password");
    $crl = curl_init();
    $header = array(
        "Content-Type: application/json",
        "Authorization: Basic ".$token,
    );
    $body = array(
        "appId" => "id1234567",
        "countryCode" => "94",
        "os" => "iOS",
        "previewLink" => "https://www.baidu.com",
        "testLink" => "http://www.baidu.com",
    );
    $postBody = json_encode($body);
    curl_setopt($crl, CURLOPT_URL, $url);
    curl_setopt($crl, CURLOPT_POST, true); 
    curl_setopt($crl, CURLOPT_HTTPHEADER, $header);
    curl_setopt($crl, CURLOPT_POSTFIELDS, $postBody);
    $rest = curl_exec($crl);
    curl_close($crl);
?>
```
