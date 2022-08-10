public class trans {
    int max_num;
    int pre_num;
    int cost;
    String bus_num;
    int oil;
    int speed;
    String status="운행";

    public void Start(int oil){
        if(oil>=10){
            status="운행 가능";
        }
    }
    public void PlusPerson(){
        //- 승객 탑승은 택시 상태가 ‘일반'일 때만 가능합니다.
        //- 그 외 택시는 ‘탑승 불가’ 처리를 해주세요.
        //- ‘일반’ 상태의 택시가 승객을 태우면 ‘운행 중’ 상태로 변경해 주세요

    }
    public void ChangeSpeed(){
        //변경할 속도를 입력 받아 현재 속도에 추가 하거나 뺄 수 있어야 합니다.

    }
    public void PlusCost(){
        //- 기본 거리보다 먼 곳은 추가 요금이 붙습니다.
        //- 기본 거리와 추가 요금은 자유롭게 산정해 주세요

    }
    public void PrintCost(){
        //최종 요금을 출력하는 것으로 합니다.
    }
}
