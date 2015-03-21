package com.lubyte.ticktock;
import java.util.Date;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

public final class TickTock{
  public static Date tick(){
      return new Date();
  }

  public static void tock(Date time1, JSONObject data){
    Date time2 = new Date();
    long interval = time2.getTime() - time1.getTime();
    if(interval < 0){
      interval *= -1;
    }
    JSONObject timeObj = new JSONObject();
    try{
    timeObj.put("interval", interval);
    timeObj.put("message", data);
    }catch(JSONException e){
      e.printStackTrace();
    }
    Log.i(LOGTAG, timeObj.toString());
  }
}