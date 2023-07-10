public class Professor {
    public String info;

    public String getInfo(){
        return this.info;
    }
    public void setInfo(String str){
        this.info = str;
    }
    public void write(Board b){
        b.add(this.info);
    }
}
