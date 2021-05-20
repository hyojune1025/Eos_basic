package callBack;

public class Browser implements OnDownLoadListener{
    void Start(){
        Download(this);
    }
    void Download(OnDownLoadListener listener){
        listener.onDownFinish();
    }

    @Override
    public void onDownFinish() {
        System.out.println("다운로드 완료!");
    }

    @Override
    public void onDownFailed() {
        System.out.println("다울로드 실패");
    }

    public void imgClick(){

    }

}
