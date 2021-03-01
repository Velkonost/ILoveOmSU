package lab_3.filter;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class BeginStringFilter implements Filter {
    private final String pattern;

    public BeginStringFilter(String pattern){
        if(pattern == null || pattern.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.pattern = pattern;
    }


    @Override
    public boolean apply(String string) {
        return string != null && string.startsWith(pattern);
    }
}
