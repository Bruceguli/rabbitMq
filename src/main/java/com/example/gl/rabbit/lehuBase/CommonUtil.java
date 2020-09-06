//package com.example.gl.rabbit.lehuBase;
//
//import com.lehu.constructionsite.framework.constant.ConnectForm;
//import org.apache.commons.lang3.StringUtils;
//import org.dom4j.Document;
//import org.dom4j.DocumentHelper;
//import org.dom4j.Element;
//
//import javax.validation.ConstraintViolation;
//import javax.validation.Validation;
//import javax.validation.Validator;
//import javax.validation.ValidatorFactory;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.URL;
//import java.net.URLConnection;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//public class CommonUtil {
//
//    /**
//     * 获取UUID
//     *
//     * @return
//     */
//    public static String uuid() {
//        return UUID.randomUUID().toString().replace("-", "");
//    }
//
//    //解析xml返回map
//    @SuppressWarnings("unchecked")
//    public static Map<String, Object> xml(String str) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        try {
//            Document doc = DocumentHelper.parseText(str);
//            Element rootElt = doc.getRootElement(); // 获取根节点
//            System.out.println("根节点：" + rootElt.elements().size()); // 拿到根节点的名称
//            List<Element> list = rootElt.elements();
//            for (Element element : list) {
//                System.out.println(element.getName() + element.getData());
//                map.put(element.getName(), element.getData());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return map;
//    }
//
////    public static void keys(List<Menu> menus, List<String> keys) {
////        for (Menu menu : menus) {
////            keys.add(menu.getResourceId());
////            keys(menu.getChildren(), keys);
////        }
////    }
//
//    /**
//     * 数据校验
//     *
//     * @param bean
//     * @return
//     */
//    private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//    private static Validator validator = factory.getValidator();
//
//    public static Map<String, String> validate(Object bean) {
//        Set<ConstraintViolation<Object>> validate = validator.validate(bean);
//        Map<String, String> map = new HashMap<>();
//        validate.forEach(p -> map.put(p.getPropertyPath().toString(), p.getMessage()));
//        return map;
//    }
//
//    /**
//     * 日期转化字符串
//     *
//     * @param date
//     * @param format
//     * @return
//     */
//
//    public static String formatDate(Date date, String format) {
//        if (date == null) {
//            return null;
//        } else {
//            SimpleDateFormat formatter = null;
//            if (StringUtils.isNotBlank(format)) {
//                formatter = new SimpleDateFormat(format);
//            } else {
//                formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            }
//
//            String dateStr = null;
//
//            try {
//                dateStr = formatter.format(date);
//                return dateStr;
//            } catch (Exception var5) {
//                return null;
//            }
//        }
//    }
//
//    /**
//     * POST请求
//     *
//     * @param url
//     * @param param
//     * @return
//     */
//    public static String sendPost(String url, String param) {
//        PrintWriter out = null;
//        BufferedReader in = null;
//        String result = "";
//
//        try {
//            URL ex = new URL(url);
//            URLConnection conn = ex.openConnection();
//            conn.setRequestProperty("accept", "*/*");
//            conn.setRequestProperty("connection", "Keep-Alive");
//            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
//            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            out = new PrintWriter(conn.getOutputStream());
//            out.print(param);
//            out.flush();
//
//            String line;
//            for (in = new BufferedReader(new InputStreamReader(conn.getInputStream())); (line = in.readLine()) != null; result = result + line) {
//                ;
//            }
//        } catch (Exception var16) {
//            System.out.println("发送 POST 请求出现异常！" + var16);
//            var16.printStackTrace();
//        } finally {
//            try {
//                if (out != null) {
//                    out.close();
//                }
//
//                if (in != null) {
//                    in.close();
//                }
//            } catch (IOException var15) {
//                var15.printStackTrace();
//            }
//
//        }
//
//        return result;
//    }
//
//    /**
//     * 获得随机数
//     *
//     * @param lenth
//     * @param size
//     * @return
//     */
//    public static String getRandomNum(int lenth, int size) {
//        String sRand = "";
//        Random random = new Random();
//
//        for (int i = 0; i < lenth; ++i) {
//            String rand = String.valueOf(random.nextInt(size));
//            sRand = sRand + rand;
//        }
//
//        return sRand;
//    }
//
//    public static Integer getNowTimeMilly() {
//        String time = System.currentTimeMillis() / 1000L + "";
//        return Integer.valueOf(Integer.parseInt(time));
//    }
//
//    /**
//     * 向指定URL发送GET方法的请求
//     *
//     * @param url   发送请求的URL
//     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
//     * @return URL 所代表远程资源的响应结果
//     */
//    public static String sendGet(String url, String param, ConnectForm connectForm) {
//        String result = "";
//        BufferedReader in = null;
//        try {
//            String urlNameString = url + "?" + param;
//            URL realUrl = new URL(urlNameString);
//            // 打开和URL之间的连接
//            URLConnection connection = realUrl.openConnection();
//            // 设置通用的请求属性
//            connection.setRequestProperty("accept", "*/*");
//            connection.setRequestProperty("connection", "Keep-Alive");
//            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
//            if (null != connectForm) {
//                connection.setRequestProperty(connectForm.getKey(), connectForm.getValue());
//            }
//
//            // 建立实际的连接
//            connection.connect();
//            // 获取所有响应头字段
//            Map<String, List<String>> map = connection.getHeaderFields();
//            // 遍历所有的响应头字段
//            for (String key : map.keySet()) {
//                System.out.println(key + "--->" + map.get(key));
//            }
//            // 定义 BufferedReader输入流来读取URL的响应
//            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            String line;
//            while ((line = in.readLine()) != null) {
//                result += line;
//            }
//        } catch (Exception e) {
//            System.out.println("发送GET请求出现异常！" + e);
//            e.printStackTrace();
//        }
//        // 使用finally块来关闭输入流
//        finally {
//            try {
//                if (in != null) {
//                    in.close();
//                }
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }
//        }
//        return result;
//    }
//}
