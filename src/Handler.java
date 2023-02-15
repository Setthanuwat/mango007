public interface Handler {
    public void setHandler(Handler h);//กำหนดว่า ถ้าตัวเองทำไม่ไได้ จะส่งต่อให้ใคร
    public void process(File file);
    public String getName();
}
