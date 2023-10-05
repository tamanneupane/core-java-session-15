package collections.arraylist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public class ArrayListPractice {

    public static void main(String[] args) {

        String[] nameArray = new String[10];
        System.out.println(Arrays.toString(nameArray));
        nameArray[0] = "Taman";
        nameArray[1] = "Ram";
        nameArray[2] = "Shyam";
        System.out.println(Arrays.toString(nameArray));

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);
        names.add("Taman");
        names.add("Ram");
        names.add("Shyam");
        System.out.println(names);
        names.add(1, "Sita");
        System.out.println(names);
        names.set(3,"Hari");
        System.out.println(names);

//        names.clear();
//        System.out.println(names);
        String oneName = names.get(2);
        System.out.println(oneName);

        boolean containCheck = names.contains("Shyam");
        System.out.println("Contain Name : " + containCheck);

        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setPostId(UUID.randomUUID().toString());
        post1.setCaption("Rainy Day");
        post1.setDate(LocalDate.now());
        post1.setPostedBy("Taman");

        posts.add(post1);

        Post post2 = new Post();
        post2.setPostId(UUID.randomUUID().toString());
        post2.setCaption("Hello Friends");
        post2.setDate(LocalDate.now());
        post2.setPostedBy("ABC");

        posts.add(post2);

        System.out.println(posts);

        Post postToSearch = new Post();
        postToSearch.setPostId(post2.getPostId());
        postToSearch.setCaption("Hello Friends");
        postToSearch.setDate(LocalDate.now());
        postToSearch.setPostedBy("Taman");

        System.out.println("Post contains : "+ posts.contains(postToSearch));
        System.out.println("Post Index : "+ posts.indexOf(postToSearch));
        System.out.println("Post is Empty : "+ posts.isEmpty());
        System.out.println("Post size : "+ posts.size());

//        posts.remove(1);
//        boolean hasRemoved = posts.remove(postToSearch);
//        System.out.println("Has Removed : " + hasRemoved);

        posts.removeIf(new Predicate<Post>() {
            @Override
            public boolean test(Post post) {
                return post.getPostedBy().equals("ABC");
            }
        });

        System.out.println(posts);

        System.out.println(names);

        List<String> subList = names.subList(1,3);

        System.out.println(subList);

    }
}
