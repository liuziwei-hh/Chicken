package s;
import s.Chicken;

public  class AccumulateImp extends Chicken implements Accumulate{

    @Override
    public  int Accumulate() {
        Chicken chicken=new Chicken();
        for(chicken.setCock_num(1);chicken.cock_num<=20;chicken.cock_num++){
            for(chicken.setHen_num(1);chicken.hen_num<=33;chicken.hen_num++){
               for(chicken.setChick_num(1);chicken.chick_num<=100;chicken.chick_num++){
                      if(chicken.cock_num*chicken.getCock_price()+chicken.hen_num*chicken.getHen_price()+chicken.chick_num*chicken.getChick_price()==100.0&&chicken.chick_num+chicken.hen_num+chicken.cock_num==100){
                          System.out.println("公鸡个数为："+chicken.cock_num+"母鸡个数为："+chicken.hen_num+"小鸡个数为："+chicken.chick_num);
                      }
               }
            }
        }
        return 0;
    }
}
