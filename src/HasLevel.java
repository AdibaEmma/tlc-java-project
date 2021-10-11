
public interface HasLevel {
     enum Level { LEVEL_100, LEVEL_200 , LEVEL_300, LEVEL_400 };

     Level studentLevel = Level.LEVEL_100;
     Level getLevel();
}
