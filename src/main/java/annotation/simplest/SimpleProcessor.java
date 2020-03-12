package annotation.simplest;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * @author 10745
 * @date 2020/3/12 21:52
 **/
@SupportedAnnotationTypes("annotation.simplest.Simple")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class SimpleProcessor extends AbstractProcessor {
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (TypeElement t : annotations) {
            System.out.println(t);
        }
        for (Element el : roundEnv.getElementsAnnotatedWith(Simple.class)) {
            dispaly(el);
        }
        return false;
    }

    private void dispaly(Element el) {
        System.out.println("====== " + el + "=======");
        System.out.println(el.getKind() +
                ":" + el.getModifiers() +
                ":" + el.getSimpleName() +
                ":" + el.asType());
        if (el.getKind().equals(ElementKind.CLASS)) {
            final TypeElement el1 = (TypeElement) el;
            System.out.println(el1.getQualifiedName());
            System.out.println(el1.getSuperclass());
            System.out.println(el1.getEnclosedElements());
        }
        if (el.getKind().equals(ElementKind.METHOD)) {
            final ExecutableElement ex = (ExecutableElement) el;
            System.out.println(ex.getReturnType());
            System.out.println(ex.getSimpleName());
            System.out.println(ex.getParameters());
        }
    }
}
