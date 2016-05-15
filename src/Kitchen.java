import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import Simulation.*;//test.sysj line: 1, column: 1

public class Kitchen extends ClockDomain{
  public Kitchen(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public output_Channel lightStatus_o = new output_Channel();
  public output_Channel humanPresenceStatus_o = new output_Channel();
  public output_Channel lightIntensityValue_o = new output_Channel();
  private Signal isLightON_1;
  private Signal isHumanPresent_1;
  private Signal lightIntensity_1;
  private boolean temp_thread_3;//test.sysj line: 10, column: 4
  private HumanPresenceSimulation humanPresenceSimulation_thread_6;//test.sysj line: 26, column: 4
  private boolean temp_thread_6;//test.sysj line: 27, column: 4
  private double temp_thread_9;//test.sysj line: 44, column: 4
  private boolean temp_thread_4;//test.sysj line: 16, column: 4
  private boolean temp_thread_7;//test.sysj line: 34, column: 4
  private double temp_thread_10;//test.sysj line: 50, column: 4
  private int S158 = 1;
  private int S51 = 1;
  private int S2 = 1;
  private int S1 = 1;
  private int S49 = 1;
  private int S4 = 1;
  private int S11 = 1;
  private int S6 = 1;
  private int S103 = 1;
  private int S101 = 1;
  private int S56 = 1;
  private int S63 = 1;
  private int S58 = 1;
  private int S155 = 1;
  private int S153 = 1;
  private int S108 = 1;
  private int S115 = 1;
  private int S110 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread277(int [] tdone, int [] ends){
        active[11]=0;
    ends[11]=0;
    tdone[11]=1;
  }

  public void thread275(int [] tdone, int [] ends){
        switch(S153){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S108){
          case 0 : 
            if(lightIntensity_1.getprestatus()){//test.sysj line: 49, column: 10
              temp_thread_10 = ((double)lightIntensity_1.getpreval());//test.sysj line: 50, column: 4
              System.out.println("Light Intensity: " + temp_thread_10);//test.sysj line: 51, column: 4
              S108=1;
              S115=0;
              if(!lightIntensityValue_o.isPartnerPresent() || lightIntensityValue_o.isPartnerPreempted()){//test.sysj line: 52, column: 4
                lightIntensityValue_o.setREQ(false);//test.sysj line: 52, column: 4
                S115=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S110=0;
                if(lightIntensityValue_o.isACK()){//test.sysj line: 52, column: 4
                  lightIntensityValue_o.setVal(temp_thread_10);//test.sysj line: 52, column: 4
                  S110=1;
                  if(!lightIntensityValue_o.isACK()){//test.sysj line: 52, column: 4
                    lightIntensityValue_o.setREQ(false);//test.sysj line: 52, column: 4
                    ends[10]=2;
                    ;//test.sysj line: 52, column: 4
                    S153=0;
                    active[10]=0;
                    ends[10]=0;
                    tdone[10]=1;
                  }
                  else {
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                else {
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
              }
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            switch(S115){
              case 0 : 
                if(!lightIntensityValue_o.isPartnerPresent() || lightIntensityValue_o.isPartnerPreempted()){//test.sysj line: 52, column: 4
                  lightIntensityValue_o.setREQ(false);//test.sysj line: 52, column: 4
                  S115=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S110){
                    case 0 : 
                      if(lightIntensityValue_o.isACK()){//test.sysj line: 52, column: 4
                        lightIntensityValue_o.setVal(temp_thread_10);//test.sysj line: 52, column: 4
                        S110=1;
                        if(!lightIntensityValue_o.isACK()){//test.sysj line: 52, column: 4
                          lightIntensityValue_o.setREQ(false);//test.sysj line: 52, column: 4
                          ends[10]=2;
                          ;//test.sysj line: 52, column: 4
                          S153=0;
                          active[10]=0;
                          ends[10]=0;
                          tdone[10]=1;
                        }
                        else {
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                      }
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lightIntensityValue_o.isACK()){//test.sysj line: 52, column: 4
                        lightIntensityValue_o.setREQ(false);//test.sysj line: 52, column: 4
                        ends[10]=2;
                        ;//test.sysj line: 52, column: 4
                        S153=0;
                        active[10]=0;
                        ends[10]=0;
                        tdone[10]=1;
                      }
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S115=1;
                S115=0;
                if(!lightIntensityValue_o.isPartnerPresent() || lightIntensityValue_o.isPartnerPreempted()){//test.sysj line: 52, column: 4
                  lightIntensityValue_o.setREQ(false);//test.sysj line: 52, column: 4
                  S115=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S110=0;
                  if(lightIntensityValue_o.isACK()){//test.sysj line: 52, column: 4
                    lightIntensityValue_o.setVal(temp_thread_10);//test.sysj line: 52, column: 4
                    S110=1;
                    if(!lightIntensityValue_o.isACK()){//test.sysj line: 52, column: 4
                      lightIntensityValue_o.setREQ(false);//test.sysj line: 52, column: 4
                      ends[10]=2;
                      ;//test.sysj line: 52, column: 4
                      S153=0;
                      active[10]=0;
                      ends[10]=0;
                      tdone[10]=1;
                    }
                    else {
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                  }
                  else {
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread274(int [] tdone, int [] ends){
        active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread273(int [] tdone, int [] ends){
        switch(S155){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        lightIntensity_1.setClear();//test.sysj line: 42, column: 3
        thread274(tdone,ends);
        thread275(tdone,ends);
        int biggest276 = 0;
        if(ends[9]>=biggest276){
          biggest276=ends[9];
        }
        if(ends[10]>=biggest276){
          biggest276=ends[10];
        }
        if(biggest276 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest276 == 0){
          S155=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread271(int [] tdone, int [] ends){
        switch(S101){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S56){
          case 0 : 
            if(isHumanPresent_1.getprestatus()){//test.sysj line: 33, column: 10
              temp_thread_7 = ((boolean)isHumanPresent_1.getpreval());//test.sysj line: 34, column: 4
              System.out.println("Human Presence: " + temp_thread_7);//test.sysj line: 35, column: 4
              S56=1;
              S63=0;
              if(!humanPresenceStatus_o.isPartnerPresent() || humanPresenceStatus_o.isPartnerPreempted()){//test.sysj line: 36, column: 4
                humanPresenceStatus_o.setREQ(false);//test.sysj line: 36, column: 4
                S63=1;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S58=0;
                if(humanPresenceStatus_o.isACK()){//test.sysj line: 36, column: 4
                  humanPresenceStatus_o.setVal(temp_thread_7);//test.sysj line: 36, column: 4
                  S58=1;
                  if(!humanPresenceStatus_o.isACK()){//test.sysj line: 36, column: 4
                    humanPresenceStatus_o.setREQ(false);//test.sysj line: 36, column: 4
                    ends[7]=2;
                    ;//test.sysj line: 36, column: 4
                    S101=0;
                    active[7]=0;
                    ends[7]=0;
                    tdone[7]=1;
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                else {
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            switch(S63){
              case 0 : 
                if(!humanPresenceStatus_o.isPartnerPresent() || humanPresenceStatus_o.isPartnerPreempted()){//test.sysj line: 36, column: 4
                  humanPresenceStatus_o.setREQ(false);//test.sysj line: 36, column: 4
                  S63=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S58){
                    case 0 : 
                      if(humanPresenceStatus_o.isACK()){//test.sysj line: 36, column: 4
                        humanPresenceStatus_o.setVal(temp_thread_7);//test.sysj line: 36, column: 4
                        S58=1;
                        if(!humanPresenceStatus_o.isACK()){//test.sysj line: 36, column: 4
                          humanPresenceStatus_o.setREQ(false);//test.sysj line: 36, column: 4
                          ends[7]=2;
                          ;//test.sysj line: 36, column: 4
                          S101=0;
                          active[7]=0;
                          ends[7]=0;
                          tdone[7]=1;
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!humanPresenceStatus_o.isACK()){//test.sysj line: 36, column: 4
                        humanPresenceStatus_o.setREQ(false);//test.sysj line: 36, column: 4
                        ends[7]=2;
                        ;//test.sysj line: 36, column: 4
                        S101=0;
                        active[7]=0;
                        ends[7]=0;
                        tdone[7]=1;
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S63=1;
                S63=0;
                if(!humanPresenceStatus_o.isPartnerPresent() || humanPresenceStatus_o.isPartnerPreempted()){//test.sysj line: 36, column: 4
                  humanPresenceStatus_o.setREQ(false);//test.sysj line: 36, column: 4
                  S63=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S58=0;
                  if(humanPresenceStatus_o.isACK()){//test.sysj line: 36, column: 4
                    humanPresenceStatus_o.setVal(temp_thread_7);//test.sysj line: 36, column: 4
                    S58=1;
                    if(!humanPresenceStatus_o.isACK()){//test.sysj line: 36, column: 4
                      humanPresenceStatus_o.setREQ(false);//test.sysj line: 36, column: 4
                      ends[7]=2;
                      ;//test.sysj line: 36, column: 4
                      S101=0;
                      active[7]=0;
                      ends[7]=0;
                      tdone[7]=1;
                    }
                    else {
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread270(int [] tdone, int [] ends){
        active[6]=0;
    ends[6]=0;
    tdone[6]=1;
  }

  public void thread269(int [] tdone, int [] ends){
        switch(S103){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        isHumanPresent_1.setClear();//test.sysj line: 24, column: 3
        thread270(tdone,ends);
        thread271(tdone,ends);
        int biggest272 = 0;
        if(ends[6]>=biggest272){
          biggest272=ends[6];
        }
        if(ends[7]>=biggest272){
          biggest272=ends[7];
        }
        if(biggest272 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest272 == 0){
          S103=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread267(int [] tdone, int [] ends){
        switch(S49){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S4){
          case 0 : 
            if(isLightON_1.getprestatus()){//test.sysj line: 15, column: 10
              temp_thread_4 = ((boolean)isLightON_1.getpreval());//test.sysj line: 16, column: 4
              System.out.println("Light status: " + temp_thread_4);//test.sysj line: 17, column: 4
              S4=1;
              S11=0;
              if(!lightStatus_o.isPartnerPresent() || lightStatus_o.isPartnerPreempted()){//test.sysj line: 18, column: 4
                lightStatus_o.setREQ(false);//test.sysj line: 18, column: 4
                S11=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S6=0;
                if(lightStatus_o.isACK()){//test.sysj line: 18, column: 4
                  lightStatus_o.setVal(temp_thread_4);//test.sysj line: 18, column: 4
                  S6=1;
                  if(!lightStatus_o.isACK()){//test.sysj line: 18, column: 4
                    lightStatus_o.setREQ(false);//test.sysj line: 18, column: 4
                    ends[4]=2;
                    ;//test.sysj line: 18, column: 4
                    S49=0;
                    active[4]=0;
                    ends[4]=0;
                    tdone[4]=1;
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            switch(S11){
              case 0 : 
                if(!lightStatus_o.isPartnerPresent() || lightStatus_o.isPartnerPreempted()){//test.sysj line: 18, column: 4
                  lightStatus_o.setREQ(false);//test.sysj line: 18, column: 4
                  S11=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S6){
                    case 0 : 
                      if(lightStatus_o.isACK()){//test.sysj line: 18, column: 4
                        lightStatus_o.setVal(temp_thread_4);//test.sysj line: 18, column: 4
                        S6=1;
                        if(!lightStatus_o.isACK()){//test.sysj line: 18, column: 4
                          lightStatus_o.setREQ(false);//test.sysj line: 18, column: 4
                          ends[4]=2;
                          ;//test.sysj line: 18, column: 4
                          S49=0;
                          active[4]=0;
                          ends[4]=0;
                          tdone[4]=1;
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lightStatus_o.isACK()){//test.sysj line: 18, column: 4
                        lightStatus_o.setREQ(false);//test.sysj line: 18, column: 4
                        ends[4]=2;
                        ;//test.sysj line: 18, column: 4
                        S49=0;
                        active[4]=0;
                        ends[4]=0;
                        tdone[4]=1;
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S11=1;
                S11=0;
                if(!lightStatus_o.isPartnerPresent() || lightStatus_o.isPartnerPreempted()){//test.sysj line: 18, column: 4
                  lightStatus_o.setREQ(false);//test.sysj line: 18, column: 4
                  S11=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S6=0;
                  if(lightStatus_o.isACK()){//test.sysj line: 18, column: 4
                    lightStatus_o.setVal(temp_thread_4);//test.sysj line: 18, column: 4
                    S6=1;
                    if(!lightStatus_o.isACK()){//test.sysj line: 18, column: 4
                      lightStatus_o.setREQ(false);//test.sysj line: 18, column: 4
                      ends[4]=2;
                      ;//test.sysj line: 18, column: 4
                      S49=0;
                      active[4]=0;
                      ends[4]=0;
                      tdone[4]=1;
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread266(int [] tdone, int [] ends){
        switch(S2){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1){
        }
        break;
      
    }
  }

  public void thread265(int [] tdone, int [] ends){
        switch(S51){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        isLightON_1.setClear();//test.sysj line: 8, column: 3
        thread266(tdone,ends);
        thread267(tdone,ends);
        int biggest268 = 0;
        if(ends[3]>=biggest268){
          biggest268=ends[3];
        }
        if(ends[4]>=biggest268){
          biggest268=ends[4];
        }
        if(biggest268 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest268 == 0){
          S51=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread263(int [] tdone, int [] ends){
        active[11]=0;
    ends[11]=0;
    tdone[11]=1;
  }

  public void thread261(int [] tdone, int [] ends){
        S153=1;
    S108=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread260(int [] tdone, int [] ends){
        temp_thread_9 = 3.66;//test.sysj line: 44, column: 4
    lightIntensity_1.setPresent();//test.sysj line: 45, column: 4
    currsigs.addElement(lightIntensity_1);
    lightIntensity_1.setValue(temp_thread_9);//test.sysj line: 45, column: 4
    System.out.println("Emitted lightIntensity_1");
    active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread259(int [] tdone, int [] ends){
        S155=1;
    lightIntensity_1.setClear();//test.sysj line: 42, column: 3
    thread260(tdone,ends);
    thread261(tdone,ends);
    int biggest262 = 0;
    if(ends[9]>=biggest262){
      biggest262=ends[9];
    }
    if(ends[10]>=biggest262){
      biggest262=ends[10];
    }
    if(biggest262 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread257(int [] tdone, int [] ends){
        S101=1;
    S56=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread256(int [] tdone, int [] ends){
        humanPresenceSimulation_thread_6 = new HumanPresenceSimulation();//test.sysj line: 26, column: 4
    temp_thread_6 = humanPresenceSimulation_thread_6.getHumanPresenceStatus("07:24:00");//test.sysj line: 27, column: 4
    isHumanPresent_1.setPresent();//test.sysj line: 29, column: 4
    currsigs.addElement(isHumanPresent_1);
    isHumanPresent_1.setValue(temp_thread_6);//test.sysj line: 29, column: 4
    System.out.println("Emitted isHumanPresent_1");
    active[6]=0;
    ends[6]=0;
    tdone[6]=1;
  }

  public void thread255(int [] tdone, int [] ends){
        S103=1;
    isHumanPresent_1.setClear();//test.sysj line: 24, column: 3
    thread256(tdone,ends);
    thread257(tdone,ends);
    int biggest258 = 0;
    if(ends[6]>=biggest258){
      biggest258=ends[6];
    }
    if(ends[7]>=biggest258){
      biggest258=ends[7];
    }
    if(biggest258 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread253(int [] tdone, int [] ends){
        S49=1;
    S4=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread252(int [] tdone, int [] ends){
        S2=1;
    temp_thread_3 = false;//test.sysj line: 10, column: 4
    isLightON_1.setPresent();//test.sysj line: 11, column: 4
    currsigs.addElement(isLightON_1);
    isLightON_1.setValue(temp_thread_3);//test.sysj line: 11, column: 4
    System.out.println("Emitted isLightON_1");
    S2=0;
    active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread251(int [] tdone, int [] ends){
        S51=1;
    isLightON_1.setClear();//test.sysj line: 8, column: 3
    thread252(tdone,ends);
    thread253(tdone,ends);
    int biggest254 = 0;
    if(ends[3]>=biggest254){
      biggest254=ends[3];
    }
    if(ends[4]>=biggest254){
      biggest254=ends[4];
    }
    if(biggest254 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S158){
        case 0 : 
          S158=0;
          break RUN;
        
        case 1 : 
          S158=2;
          S158=2;
          thread251(tdone,ends);
          thread255(tdone,ends);
          thread259(tdone,ends);
          thread263(tdone,ends);
          int biggest264 = 0;
          if(ends[2]>=biggest264){
            biggest264=ends[2];
          }
          if(ends[5]>=biggest264){
            biggest264=ends[5];
          }
          if(ends[8]>=biggest264){
            biggest264=ends[8];
          }
          if(ends[11]>=biggest264){
            biggest264=ends[11];
          }
          if(biggest264 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread265(tdone,ends);
          thread269(tdone,ends);
          thread273(tdone,ends);
          thread277(tdone,ends);
          int biggest278 = 0;
          if(ends[2]>=biggest278){
            biggest278=ends[2];
          }
          if(ends[5]>=biggest278){
            biggest278=ends[5];
          }
          if(ends[8]>=biggest278){
            biggest278=ends[8];
          }
          if(ends[11]>=biggest278){
            biggest278=ends[11];
          }
          if(biggest278 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest278 == 0){
            S158=0;
            active[1]=0;
            ends[1]=0;
            S158=0;
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
    isLightON_1 = new Signal();
    isHumanPresent_1 = new Signal();
    lightIntensity_1 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          lightStatus_o.gethook();
          humanPresenceStatus_o.gethook();
          lightIntensityValue_o.gethook();
          df = true;
        }
        runClockDomain();
      }
      isLightON_1.setpreclear();
      isHumanPresent_1.setpreclear();
      lightIntensity_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      isLightON_1.setClear();
      isHumanPresent_1.setClear();
      lightIntensity_1.setClear();
      lightStatus_o.sethook();
      humanPresenceStatus_o.sethook();
      lightIntensityValue_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        lightStatus_o.gethook();
        humanPresenceStatus_o.gethook();
        lightIntensityValue_o.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	System.out.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
