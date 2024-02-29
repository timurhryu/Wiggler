class Wiggler
{
  private int myX, myY;
  public Wiggler()
  {
    myX = myY = 150;
  }
   public void wiggle()
  {
    myX+=(int)(Math.random()*5)-2;
  }
  public int getmyX() {
   return myX;
  }
  public int getmyY() {
   return myY;
  }
  public void setmyX(int temp) {
   myX = temp;
  }
  public void setmyY(int temp) {
    myY = temp;
  }
  
}
