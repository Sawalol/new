package PhoneBook;

public enum ActionType {
    ADD(1), DELEATE(2), UPDATE(3), SHOW(4), FINDBYNAME(5), EXIT(0);
      private int index ;
    ActionType(int index) {
        this.index = index;
         }
         public int getIndex(){
        return index;
         }
}
