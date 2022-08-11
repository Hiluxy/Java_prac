package transport;

public class Bus extends trans{
    String state="";

    Bus(){
        this.max_num=30;
        this.cost=1000;
        this.state="운행중";
    }

    @Override
    public void Start(int num){
        if(this.status=="운행중"){
//            this.pre_num+=n;
            if(this.max_num-num<0){
            }
        }
    }

}

