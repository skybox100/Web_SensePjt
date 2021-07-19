package egovframework.SenseArmy.main.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonAPI_Test {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      try {
		 //URL url = new URL("http://210.179.61.226:5002/common/CheckUser/CheckUserNewSave"); 
		 URL url = new URL("http://www.sensekorea.kr:5002/common/CheckUser/CheckUserNewSave"); 

		 
		 
			// URL url = new URL("http://110.10.130.51:5002/common/CheckUser/CheckUserNewSave"); 
         HttpURLConnection con = (HttpURLConnection)url.openConnection();
         con.setRequestProperty("Content-Type", "application/json; utf-8");
         con.setRequestProperty("Accept", "application/json");
         con.setRequestProperty("Method", "POST");
         con.setDoOutput(true);

         JSONObject json = new JSONObject();
         json.put("ServiceNumber", "1234");
         json.put("MobileNumber", "01028957223");
         json.put("Password", "1234");
         json.put("IsDevice", "p");
         json.put("Skip", 0);
         json.put("Take", 0);
         
         OutputStream os = con.getOutputStream();
         
         byte[] input = json.toString().getBytes("utf-8");
         os.write(input, 0, input.length);
         String res = "";
         
         try(BufferedReader br = new BufferedReader(
                 new InputStreamReader(con.getInputStream(), "utf-8"))) {
                   StringBuilder response = new StringBuilder();
                   String responseLine = null;
                   while ((responseLine = br.readLine()) != null) {
                       response.append(responseLine.trim());
                   }
                   res = response.toString();
                   System.out.println(res);
         }
         
         JSONParser parser = new JSONParser();
         JSONObject jsonObj = (JSONObject) parser.parse(res);
         JSONArray locations = (JSONArray) jsonObj.get("resultList");
         
         /*
         JSONObject tmp = (JSONObject) locations.get(0);
         
         for(int i=0; i<tmp.size(); i++) {
         
         }
                 System.out.println("userKey: " + tmp.get("userKey").getClass().getName());
         System.out.println("idx: " + tmp.get("idx").getClass().getName());
         System.out.println("isDevice: " + tmp.get("isDevice").getClass().getName());
         System.out.println("inputTime: " + tmp.get("inputTime").getClass().getName());
         System.out.println("accuracy: " + tmp.get("accuracy").getClass().getName());
         System.out.println("altitude: " + tmp.get("altitude").getClass().getName());
         System.out.println("direction: " + tmp.get("direction").getClass().getName());
         System.out.println("latitude: " + tmp.get("latitude").getClass().getName());
         System.out.println("longitude: " + tmp.get("longitude").getClass().getName());
         System.out.println("speed: " + tmp.get("speed").getClass().getName());
         System.out.println("timestamp: " + tmp.get("timestamp").getClass().getName());
         System.out.println("batteryPercent: " + tmp.get("batteryPercent").getClass().getName());
         System.out.println("isCharger: " + tmp.get("isCharger").getClass().getName());
         System.out.println("heartRate: " + tmp.get("heartRate").getClass().getName());
         System.out.println("lobp: " + tmp.get("lobp").getClass().getName());
         System.out.println("hibp: " + tmp.get("hibp").getClass().getName());
         System.out.println("distencesatellite: " + tmp.get("distencesatellite").getClass().getName());
         System.out.println("distenceTime: " + tmp.get("distenceTime").getClass().getName());
         System.out.println("serviceNumber: " + tmp.get("serviceNumber").getClass().getName());
         System.out.println("name: " + tmp.get("name").getClass().getName());
         */
         
         /*
         for(int i=0;i<locations.size();i++){

            JSONObject tmp = (JSONObject) locations.get(i);

            String userKey = (String)tmp.get("userKey");
            String idx = String.valueOf(tmp.get("idx"));
            String isDevice = (String)tmp.get("isDevice");
            String inputTime = (String)tmp.get("inputTime");
            String accuracy = String.valueOf(tmp.get("accuracy"));
            String altitude = String.valueOf(tmp.get("altitude"));
            String direction = String.valueOf(tmp.get("direction"));
            String latitude = (String)tmp.get("latitude");
            String longitude = (String)tmp.get("longitude");
            String speed = String.valueOf(tmp.get("speed"));
            String timestamp = (String)tmp.get("timestamp");
            String batteryPercent = String.valueOf(tmp.get("batteryPercent"));
            String isCharger = (String)tmp.get("isCharger");
            String heartRate = String.valueOf(tmp.get("heartRate"));
            String lobp = String.valueOf(tmp.get("lobp"));
            String hibp = String.valueOf(tmp.get("hibp"));
            String distencesatellite = String.valueOf(tmp.get("distencesatellite"));
            String distenceTime = String.valueOf(tmp.get("distenceTime"));
            String serviceNumber = (String)tmp.get("serviceNumber");
            String name = (String)tmp.get("name");
            
            System.out.println("\n");
            System.out.println("----- " + (i+1) + "번째 검색 결과 -----");
            System.out.println("userKey : " + userKey);
            System.out.println("idx : " + idx);
            System.out.println("isDevice : " + isDevice);
            System.out.println("inputTime : " + inputTime);
            System.out.println("accuracy : " + accuracy);
            System.out.println("altitude : " + altitude);
            System.out.println("direction : " + direction);
            System.out.println("latitude : " + latitude);
            System.out.println("longitude : " + longitude);
            System.out.println("speed : " + speed);
            System.out.println("timestamp : " + timestamp);
            System.out.println("batteryPercent : " + batteryPercent);
            System.out.println("isCharger : " + isCharger);
            System.out.println("heartRate : " + heartRate);
            System.out.println("lobp : " + lobp);
            System.out.println("hibp : " + hibp);
            System.out.println("distencesatellite : " + distencesatellite);
            System.out.println("distenceTime : " + distenceTime);
            System.out.println("serviceNumber : " + serviceNumber);
            System.out.println("name : " + name);
         }
         */
         
      } catch (MalformedURLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (ParseException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      


      
      
      
   }

}