package model.builderPattern;

public class BombBuildDirector {
    
    private BombBuilder builder;
    
    public void setBombBuilder(BombBuilder builder) {
        this.builder = builder;
    }
    
    public Bomb getBomb() {
        return builder.getBomb();
    }
    
    public void createBomb() {
        builder.createBomb();
        builder.buildColor();
        builder.buildType();
    }
}