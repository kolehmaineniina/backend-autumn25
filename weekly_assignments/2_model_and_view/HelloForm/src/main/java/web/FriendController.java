package web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import domain.Friend;

@Controller
public class FriendController {
    List<Friend> friends = new ArrayList<Friend>();
    
    public FriendController() {
        Friend friend1 = new Friend("Leah", "Hathaway");
        Friend friend2 = new Friend("John", "Levy");
        Friend friend3 = new Friend("Harry", "Smith");

        friends.add(friend1);
        friends.add(friend2);
        friends.add(friend3);

    }
    
    @GetMapping("/friends") 
    public String listFriends(Model model){
        model.addAttribute("friends", friends);
        return "friends";
    }

    @PostMapping("/add")
    public String addFriend(@ModelAttribute("friend") Friend friend, Model model) {
        friends.add(friend);
        return "redirect:friends";
    }

}
