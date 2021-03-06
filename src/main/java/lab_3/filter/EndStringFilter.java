package lab_3.filter;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class EndStringFilter implements Filter {
    private final String pattern;

    public EndStringFilter(String pattern){
        if(pattern == null || "".equals(pattern)){
            throw new IllegalArgumentException();
        }
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String string) {
        return string != null && string.endsWith(pattern);
    }
}

