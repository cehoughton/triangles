public class Triangles {
  private int mSideOne;
  private int mSideTwo;
  private int mSideThree;


  public Triangles(int sideOne, int sideTwo, int sideThree) {
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;


  }

  public int getSideOne() {
    return mSideOne;
  }

  public int getSideTwo() {
    return mSideTwo;
  }

  public int getSideThree() {
    return mSideThree;
  }

  public boolean isScalene() {
    return ((mSideOne != mSideTwo) && (mSideTwo != mSideThree) && (mSideOne != mSideThree));
  }

  public boolean isEqualateral() {
    return ((mSideOne == mSideTwo) && (mSideTwo == mSideThree));
  }
  public boolean isIsoceles() {
    return (((mSideOne == mSideTwo) && (mSideOne != mSideThree)) || ((mSideTwo == mSideThree) && (mSideTwo != mSideOne)) || ((mSideThree == mSideOne) && (mSideThree != mSideTwo)));
  }

  public boolean isNotTriangle() {
    return (((mSideOne + mSideTwo) < mSideThree) || ((mSideOne + mSideThree) < mSideTwo) || ((mSideTwo + mSideThree) < mSideOne));
  }

}
