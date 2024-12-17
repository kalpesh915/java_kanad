class CovarientParent{
    public Number getValue(){
        return 100;
    }
}

class CovarientChild extends CovarientParent{
    @Override
    public Float getValue(){
        return 100f;
    }
}

public class pro20 {

}
