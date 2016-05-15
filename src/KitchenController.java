import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import Simulation.*;//test.sysj line: 1, column: 1

public class KitchenController extends ClockDomain{
  public KitchenController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel humanPresenceStatus_in = new input_Channel();
  public input_Channel lightIntensityValue_in = new input_Channel();
  public input_Channel lightStatus_in = new input_Channel();
  private Signal humanPresence_12;
  private Signal lightState_12;
  private Signal lightIntensity_12;
  private boolean temp_thread_14;//test.sysj line: 70, column: 4
  private double temp_thread_15;//test.sysj line: 77, column: 4
  private boolean temp_thread_16;//test.sysj line: 84, column: 4
  private boolean temp_humanPresence_thread_17;//test.sysj line: 91, column: 4
  private boolean temp_lightStatus_thread_17;//test.sysj line: 92, column: 4
  private double temp_lightIntensity_thread_17;//test.sysj line: 93, column: 4
  private double LIGHT_INTENSITY_LIMIT_thread_17;//test.sysj line: 94, column: 4
  private int S249 = 1;
  private int S246 = 1;
  private int S185 = 1;
  private int S168 = 1;
  private int S163 = 1;
  private int S209 = 1;
  private int S192 = 1;
  private int S187 = 1;
  private int S233 = 1;
  private int S216 = 1;
  private int S211 = 1;
  private int S244 = 1;
  private int S236 = 1;
  private int S239 = 1;
  private int S242 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread301(int [] tdone, int [] ends){
        active[21]=0;
    ends[21]=0;
    tdone[21]=1;
  }

  public void thread298(int [] tdone, int [] ends){
        switch(S242){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(lightState_12.getprestatus()){//test.sysj line: 90, column: 62
          S242=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread297(int [] tdone, int [] ends){
        switch(S239){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(lightIntensity_12.getprestatus()){//test.sysj line: 90, column: 36
          S239=0;
          active[19]=0;
          ends[19]=0;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread296(int [] tdone, int [] ends){
        switch(S236){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(humanPresence_12.getprestatus()){//test.sysj line: 90, column: 11
          S236=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread295(int [] tdone, int [] ends){
        switch(S244){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        thread296(tdone,ends);
        thread297(tdone,ends);
        thread298(tdone,ends);
        int biggest299 = 0;
        if(ends[18]>=biggest299){
          biggest299=ends[18];
        }
        if(ends[19]>=biggest299){
          biggest299=ends[19];
        }
        if(ends[20]>=biggest299){
          biggest299=ends[20];
        }
        if(biggest299 == 1){
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        //FINXME code
        if(biggest299 == 0){
          temp_humanPresence_thread_17 = ((boolean)humanPresence_12.getpreval());//test.sysj line: 91, column: 4
          temp_lightStatus_thread_17 = ((boolean)lightState_12.getpreval());//test.sysj line: 92, column: 4
          temp_lightIntensity_thread_17 = ((double)lightIntensity_12.getpreval());//test.sysj line: 93, column: 4
          LIGHT_INTENSITY_LIMIT_thread_17 = 20.3;//test.sysj line: 94, column: 4
          if(temp_humanPresence_thread_17 == false && temp_lightStatus_thread_17 == true) {//test.sysj line: 96, column: 4
            System.out.println("Switch off light:kitchen");//test.sysj line: 97, column: 5
          }
          else {//test.sysj line: 95, column: 4
            if(temp_humanPresence_thread_17 == true && temp_lightIntensity_thread_17 < LIGHT_INTENSITY_LIMIT_thread_17 && temp_lightStatus_thread_17 == false) {//test.sysj line: 100, column: 4
              System.out.println("Switch on light to increase brightness:kitchen");//test.sysj line: 101, column: 5
            }
            else {//test.sysj line: 99, column: 9
              if(temp_humanPresence_thread_17 == true && temp_lightIntensity_thread_17 >= LIGHT_INTENSITY_LIMIT_thread_17 && temp_lightStatus_thread_17 == true) {//test.sysj line: 104, column: 4
                System.out.println("Light Intensity is high. Switch off light to save energy:kitchen");//test.sysj line: 105, column: 5
              }
            }
          }
          S244=0;
          active[17]=0;
          ends[17]=0;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread294(int [] tdone, int [] ends){
        switch(S233){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S216){
          case 0 : 
            if(!lightStatus_in.isPartnerPresent() || lightStatus_in.isPartnerPreempted()){//test.sysj line: 83, column: 4
              lightStatus_in.setACK(false);//test.sysj line: 83, column: 4
              S216=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              switch(S211){
                case 0 : 
                  if(!lightStatus_in.isREQ()){//test.sysj line: 83, column: 4
                    lightStatus_in.setACK(true);//test.sysj line: 83, column: 4
                    S211=1;
                    if(lightStatus_in.isREQ()){//test.sysj line: 83, column: 4
                      lightStatus_in.setACK(false);//test.sysj line: 83, column: 4
                      ends[16]=2;
                      ;//test.sysj line: 83, column: 4
                      temp_thread_16 = ((Boolean)lightStatus_in.getVal());//test.sysj line: 84, column: 4
                      System.out.println("Con:Light status: " + temp_thread_16);//test.sysj line: 85, column: 4
                      lightState_12.setPresent();//test.sysj line: 86, column: 4
                      currsigs.addElement(lightState_12);
                      lightState_12.setValue(temp_thread_16);//test.sysj line: 86, column: 4
                      System.out.println("Emitted lightState_12");
                      S233=0;
                      active[16]=0;
                      ends[16]=0;
                      tdone[16]=1;
                    }
                    else {
                      active[16]=1;
                      ends[16]=1;
                      tdone[16]=1;
                    }
                  }
                  else {
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                  break;
                
                case 1 : 
                  if(lightStatus_in.isREQ()){//test.sysj line: 83, column: 4
                    lightStatus_in.setACK(false);//test.sysj line: 83, column: 4
                    ends[16]=2;
                    ;//test.sysj line: 83, column: 4
                    temp_thread_16 = ((Boolean)lightStatus_in.getVal());//test.sysj line: 84, column: 4
                    System.out.println("Con:Light status: " + temp_thread_16);//test.sysj line: 85, column: 4
                    lightState_12.setPresent();//test.sysj line: 86, column: 4
                    currsigs.addElement(lightState_12);
                    lightState_12.setValue(temp_thread_16);//test.sysj line: 86, column: 4
                    System.out.println("Emitted lightState_12");
                    S233=0;
                    active[16]=0;
                    ends[16]=0;
                    tdone[16]=1;
                  }
                  else {
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            S216=1;
            S216=0;
            if(!lightStatus_in.isPartnerPresent() || lightStatus_in.isPartnerPreempted()){//test.sysj line: 83, column: 4
              lightStatus_in.setACK(false);//test.sysj line: 83, column: 4
              S216=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              S211=0;
              if(!lightStatus_in.isREQ()){//test.sysj line: 83, column: 4
                lightStatus_in.setACK(true);//test.sysj line: 83, column: 4
                S211=1;
                if(lightStatus_in.isREQ()){//test.sysj line: 83, column: 4
                  lightStatus_in.setACK(false);//test.sysj line: 83, column: 4
                  ends[16]=2;
                  ;//test.sysj line: 83, column: 4
                  temp_thread_16 = ((Boolean)lightStatus_in.getVal());//test.sysj line: 84, column: 4
                  System.out.println("Con:Light status: " + temp_thread_16);//test.sysj line: 85, column: 4
                  lightState_12.setPresent();//test.sysj line: 86, column: 4
                  currsigs.addElement(lightState_12);
                  lightState_12.setValue(temp_thread_16);//test.sysj line: 86, column: 4
                  System.out.println("Emitted lightState_12");
                  S233=0;
                  active[16]=0;
                  ends[16]=0;
                  tdone[16]=1;
                }
                else {
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
              }
              else {
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread293(int [] tdone, int [] ends){
        switch(S209){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S192){
          case 0 : 
            if(!lightIntensityValue_in.isPartnerPresent() || lightIntensityValue_in.isPartnerPreempted()){//test.sysj line: 76, column: 4
              lightIntensityValue_in.setACK(false);//test.sysj line: 76, column: 4
              S192=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              switch(S187){
                case 0 : 
                  if(!lightIntensityValue_in.isREQ()){//test.sysj line: 76, column: 4
                    lightIntensityValue_in.setACK(true);//test.sysj line: 76, column: 4
                    S187=1;
                    if(lightIntensityValue_in.isREQ()){//test.sysj line: 76, column: 4
                      lightIntensityValue_in.setACK(false);//test.sysj line: 76, column: 4
                      ends[15]=2;
                      ;//test.sysj line: 76, column: 4
                      temp_thread_15 = ((Double)lightIntensityValue_in.getVal());//test.sysj line: 77, column: 4
                      System.out.println("Con:Light In: " + temp_thread_15);//test.sysj line: 78, column: 4
                      lightIntensity_12.setPresent();//test.sysj line: 79, column: 4
                      currsigs.addElement(lightIntensity_12);
                      lightIntensity_12.setValue(temp_thread_15);//test.sysj line: 79, column: 4
                      System.out.println("Emitted lightIntensity_12");
                      S209=0;
                      active[15]=0;
                      ends[15]=0;
                      tdone[15]=1;
                    }
                    else {
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                  break;
                
                case 1 : 
                  if(lightIntensityValue_in.isREQ()){//test.sysj line: 76, column: 4
                    lightIntensityValue_in.setACK(false);//test.sysj line: 76, column: 4
                    ends[15]=2;
                    ;//test.sysj line: 76, column: 4
                    temp_thread_15 = ((Double)lightIntensityValue_in.getVal());//test.sysj line: 77, column: 4
                    System.out.println("Con:Light In: " + temp_thread_15);//test.sysj line: 78, column: 4
                    lightIntensity_12.setPresent();//test.sysj line: 79, column: 4
                    currsigs.addElement(lightIntensity_12);
                    lightIntensity_12.setValue(temp_thread_15);//test.sysj line: 79, column: 4
                    System.out.println("Emitted lightIntensity_12");
                    S209=0;
                    active[15]=0;
                    ends[15]=0;
                    tdone[15]=1;
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            S192=1;
            S192=0;
            if(!lightIntensityValue_in.isPartnerPresent() || lightIntensityValue_in.isPartnerPreempted()){//test.sysj line: 76, column: 4
              lightIntensityValue_in.setACK(false);//test.sysj line: 76, column: 4
              S192=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              S187=0;
              if(!lightIntensityValue_in.isREQ()){//test.sysj line: 76, column: 4
                lightIntensityValue_in.setACK(true);//test.sysj line: 76, column: 4
                S187=1;
                if(lightIntensityValue_in.isREQ()){//test.sysj line: 76, column: 4
                  lightIntensityValue_in.setACK(false);//test.sysj line: 76, column: 4
                  ends[15]=2;
                  ;//test.sysj line: 76, column: 4
                  temp_thread_15 = ((Double)lightIntensityValue_in.getVal());//test.sysj line: 77, column: 4
                  System.out.println("Con:Light In: " + temp_thread_15);//test.sysj line: 78, column: 4
                  lightIntensity_12.setPresent();//test.sysj line: 79, column: 4
                  currsigs.addElement(lightIntensity_12);
                  lightIntensity_12.setValue(temp_thread_15);//test.sysj line: 79, column: 4
                  System.out.println("Emitted lightIntensity_12");
                  S209=0;
                  active[15]=0;
                  ends[15]=0;
                  tdone[15]=1;
                }
                else {
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
              }
              else {
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread292(int [] tdone, int [] ends){
        switch(S185){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S168){
          case 0 : 
            if(!humanPresenceStatus_in.isPartnerPresent() || humanPresenceStatus_in.isPartnerPreempted()){//test.sysj line: 69, column: 4
              humanPresenceStatus_in.setACK(false);//test.sysj line: 69, column: 4
              S168=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              switch(S163){
                case 0 : 
                  if(!humanPresenceStatus_in.isREQ()){//test.sysj line: 69, column: 4
                    humanPresenceStatus_in.setACK(true);//test.sysj line: 69, column: 4
                    S163=1;
                    if(humanPresenceStatus_in.isREQ()){//test.sysj line: 69, column: 4
                      humanPresenceStatus_in.setACK(false);//test.sysj line: 69, column: 4
                      ends[14]=2;
                      ;//test.sysj line: 69, column: 4
                      temp_thread_14 = ((Boolean)humanPresenceStatus_in.getVal());//test.sysj line: 70, column: 4
                      System.out.println("Con:Hum Pre: " + temp_thread_14);//test.sysj line: 71, column: 4
                      humanPresence_12.setPresent();//test.sysj line: 72, column: 4
                      currsigs.addElement(humanPresence_12);
                      humanPresence_12.setValue(temp_thread_14);//test.sysj line: 72, column: 4
                      System.out.println("Emitted humanPresence_12");
                      S185=0;
                      active[14]=0;
                      ends[14]=0;
                      tdone[14]=1;
                    }
                    else {
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                  }
                  else {
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  break;
                
                case 1 : 
                  if(humanPresenceStatus_in.isREQ()){//test.sysj line: 69, column: 4
                    humanPresenceStatus_in.setACK(false);//test.sysj line: 69, column: 4
                    ends[14]=2;
                    ;//test.sysj line: 69, column: 4
                    temp_thread_14 = ((Boolean)humanPresenceStatus_in.getVal());//test.sysj line: 70, column: 4
                    System.out.println("Con:Hum Pre: " + temp_thread_14);//test.sysj line: 71, column: 4
                    humanPresence_12.setPresent();//test.sysj line: 72, column: 4
                    currsigs.addElement(humanPresence_12);
                    humanPresence_12.setValue(temp_thread_14);//test.sysj line: 72, column: 4
                    System.out.println("Emitted humanPresence_12");
                    S185=0;
                    active[14]=0;
                    ends[14]=0;
                    tdone[14]=1;
                  }
                  else {
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            S168=1;
            S168=0;
            if(!humanPresenceStatus_in.isPartnerPresent() || humanPresenceStatus_in.isPartnerPreempted()){//test.sysj line: 69, column: 4
              humanPresenceStatus_in.setACK(false);//test.sysj line: 69, column: 4
              S168=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              S163=0;
              if(!humanPresenceStatus_in.isREQ()){//test.sysj line: 69, column: 4
                humanPresenceStatus_in.setACK(true);//test.sysj line: 69, column: 4
                S163=1;
                if(humanPresenceStatus_in.isREQ()){//test.sysj line: 69, column: 4
                  humanPresenceStatus_in.setACK(false);//test.sysj line: 69, column: 4
                  ends[14]=2;
                  ;//test.sysj line: 69, column: 4
                  temp_thread_14 = ((Boolean)humanPresenceStatus_in.getVal());//test.sysj line: 70, column: 4
                  System.out.println("Con:Hum Pre: " + temp_thread_14);//test.sysj line: 71, column: 4
                  humanPresence_12.setPresent();//test.sysj line: 72, column: 4
                  currsigs.addElement(humanPresence_12);
                  humanPresence_12.setValue(temp_thread_14);//test.sysj line: 72, column: 4
                  System.out.println("Emitted humanPresence_12");
                  S185=0;
                  active[14]=0;
                  ends[14]=0;
                  tdone[14]=1;
                }
                else {
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
              }
              else {
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread291(int [] tdone, int [] ends){
        switch(S246){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        humanPresence_12.setClear();//test.sysj line: 66, column: 3
        lightState_12.setClear();//test.sysj line: 66, column: 3
        lightIntensity_12.setClear();//test.sysj line: 67, column: 3
        thread292(tdone,ends);
        thread293(tdone,ends);
        thread294(tdone,ends);
        thread295(tdone,ends);
        int biggest300 = 0;
        if(ends[14]>=biggest300){
          biggest300=ends[14];
        }
        if(ends[15]>=biggest300){
          biggest300=ends[15];
        }
        if(ends[16]>=biggest300){
          biggest300=ends[16];
        }
        if(ends[17]>=biggest300){
          biggest300=ends[17];
        }
        if(biggest300 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest300 == 0){
          S246=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread289(int [] tdone, int [] ends){
        active[21]=0;
    ends[21]=0;
    tdone[21]=1;
  }

  public void thread286(int [] tdone, int [] ends){
        S242=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread285(int [] tdone, int [] ends){
        S239=1;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread284(int [] tdone, int [] ends){
        S236=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread283(int [] tdone, int [] ends){
        S244=1;
    thread284(tdone,ends);
    thread285(tdone,ends);
    thread286(tdone,ends);
    int biggest287 = 0;
    if(ends[18]>=biggest287){
      biggest287=ends[18];
    }
    if(ends[19]>=biggest287){
      biggest287=ends[19];
    }
    if(ends[20]>=biggest287){
      biggest287=ends[20];
    }
    if(biggest287 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread282(int [] tdone, int [] ends){
        S233=1;
    S216=0;
    if(!lightStatus_in.isPartnerPresent() || lightStatus_in.isPartnerPreempted()){//test.sysj line: 83, column: 4
      lightStatus_in.setACK(false);//test.sysj line: 83, column: 4
      S216=1;
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S211=0;
      if(!lightStatus_in.isREQ()){//test.sysj line: 83, column: 4
        lightStatus_in.setACK(true);//test.sysj line: 83, column: 4
        S211=1;
        if(lightStatus_in.isREQ()){//test.sysj line: 83, column: 4
          lightStatus_in.setACK(false);//test.sysj line: 83, column: 4
          ends[16]=2;
          ;//test.sysj line: 83, column: 4
          temp_thread_16 = ((Boolean)lightStatus_in.getVal());//test.sysj line: 84, column: 4
          System.out.println("Con:Light status: " + temp_thread_16);//test.sysj line: 85, column: 4
          lightState_12.setPresent();//test.sysj line: 86, column: 4
          currsigs.addElement(lightState_12);
          lightState_12.setValue(temp_thread_16);//test.sysj line: 86, column: 4
          System.out.println("Emitted lightState_12");
          S233=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
      }
      else {
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
    }
  }

  public void thread281(int [] tdone, int [] ends){
        S209=1;
    S192=0;
    if(!lightIntensityValue_in.isPartnerPresent() || lightIntensityValue_in.isPartnerPreempted()){//test.sysj line: 76, column: 4
      lightIntensityValue_in.setACK(false);//test.sysj line: 76, column: 4
      S192=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S187=0;
      if(!lightIntensityValue_in.isREQ()){//test.sysj line: 76, column: 4
        lightIntensityValue_in.setACK(true);//test.sysj line: 76, column: 4
        S187=1;
        if(lightIntensityValue_in.isREQ()){//test.sysj line: 76, column: 4
          lightIntensityValue_in.setACK(false);//test.sysj line: 76, column: 4
          ends[15]=2;
          ;//test.sysj line: 76, column: 4
          temp_thread_15 = ((Double)lightIntensityValue_in.getVal());//test.sysj line: 77, column: 4
          System.out.println("Con:Light In: " + temp_thread_15);//test.sysj line: 78, column: 4
          lightIntensity_12.setPresent();//test.sysj line: 79, column: 4
          currsigs.addElement(lightIntensity_12);
          lightIntensity_12.setValue(temp_thread_15);//test.sysj line: 79, column: 4
          System.out.println("Emitted lightIntensity_12");
          S209=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread280(int [] tdone, int [] ends){
        S185=1;
    S168=0;
    if(!humanPresenceStatus_in.isPartnerPresent() || humanPresenceStatus_in.isPartnerPreempted()){//test.sysj line: 69, column: 4
      humanPresenceStatus_in.setACK(false);//test.sysj line: 69, column: 4
      S168=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S163=0;
      if(!humanPresenceStatus_in.isREQ()){//test.sysj line: 69, column: 4
        humanPresenceStatus_in.setACK(true);//test.sysj line: 69, column: 4
        S163=1;
        if(humanPresenceStatus_in.isREQ()){//test.sysj line: 69, column: 4
          humanPresenceStatus_in.setACK(false);//test.sysj line: 69, column: 4
          ends[14]=2;
          ;//test.sysj line: 69, column: 4
          temp_thread_14 = ((Boolean)humanPresenceStatus_in.getVal());//test.sysj line: 70, column: 4
          System.out.println("Con:Hum Pre: " + temp_thread_14);//test.sysj line: 71, column: 4
          humanPresence_12.setPresent();//test.sysj line: 72, column: 4
          currsigs.addElement(humanPresence_12);
          humanPresence_12.setValue(temp_thread_14);//test.sysj line: 72, column: 4
          System.out.println("Emitted humanPresence_12");
          S185=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
      }
      else {
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
      }
    }
  }

  public void thread279(int [] tdone, int [] ends){
        S246=1;
    humanPresence_12.setClear();//test.sysj line: 66, column: 3
    lightState_12.setClear();//test.sysj line: 66, column: 3
    lightIntensity_12.setClear();//test.sysj line: 67, column: 3
    thread280(tdone,ends);
    thread281(tdone,ends);
    thread282(tdone,ends);
    thread283(tdone,ends);
    int biggest288 = 0;
    if(ends[14]>=biggest288){
      biggest288=ends[14];
    }
    if(ends[15]>=biggest288){
      biggest288=ends[15];
    }
    if(ends[16]>=biggest288){
      biggest288=ends[16];
    }
    if(ends[17]>=biggest288){
      biggest288=ends[17];
    }
    if(biggest288 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S249){
        case 0 : 
          S249=0;
          break RUN;
        
        case 1 : 
          S249=2;
          S249=2;
          thread279(tdone,ends);
          thread289(tdone,ends);
          int biggest290 = 0;
          if(ends[13]>=biggest290){
            biggest290=ends[13];
          }
          if(ends[21]>=biggest290){
            biggest290=ends[21];
          }
          if(biggest290 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
        
        case 2 : 
          thread291(tdone,ends);
          thread301(tdone,ends);
          int biggest302 = 0;
          if(ends[13]>=biggest302){
            biggest302=ends[13];
          }
          if(ends[21]>=biggest302){
            biggest302=ends[21];
          }
          if(biggest302 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          //FINXME code
          if(biggest302 == 0){
            S249=0;
            active[12]=0;
            ends[12]=0;
            S249=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    humanPresence_12 = new Signal();
    lightState_12 = new Signal();
    lightIntensity_12 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[12] != 0){
      int index = 12;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        if(!df){
          humanPresenceStatus_in.gethook();
          lightIntensityValue_in.gethook();
          lightStatus_in.gethook();
          df = true;
        }
        runClockDomain();
      }
      humanPresence_12.setpreclear();
      lightState_12.setpreclear();
      lightIntensity_12.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      humanPresence_12.setClear();
      lightState_12.setClear();
      lightIntensity_12.setClear();
      humanPresenceStatus_in.sethook();
      lightIntensityValue_in.sethook();
      lightStatus_in.sethook();
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        humanPresenceStatus_in.gethook();
        lightIntensityValue_in.gethook();
        lightStatus_in.gethook();
      }
      runFinisher();
      if(active[12] == 0){
      	System.out.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
