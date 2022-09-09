
//ex 1. Design a class that acts as a library for the following kinds of media: book, video, and newspaper.
//        Provide one version of the class that uses generics and one that does not. Feel free to use
//        any additional APIs for storing and retrieving the media.
//public class Library {
//    private List resources = new ArrayList(); // no generics are user
//    public void addMedia( .. element) { // what should be the type of element in order to meet
//    all three media types (book, video, and newspaper)
//        resource.add(element);
//    }
//    public Media retrieveLast() {
//        ..
//    }
//
//    /*how should book, video, and newspaper classes look like? What will they have in common? */
//}
//

import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;

public class Library <T extends Media > {
    //T is a common object for inserting data from main(addMedia) for not having 3 different objects, but it doesn't work
    private final List<T> resources = new ArrayList<>();

    public void addMedia(T element){
        resources.add(element);
    }
    public Media retrieveLast() {
        return resources.get(resources.size());
    }
    //De intrebat!!
}
