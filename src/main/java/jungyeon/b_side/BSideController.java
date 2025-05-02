package jungyeon.b_side;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BSideController {

    @GetMapping("/")
    public String main(Model model) {
        File folder = new File("src/main/resources/static/assets/img/performance");
        List<String> images = Arrays.stream(folder.listFiles())
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .collect(Collectors.toList());

        List<List<String>> chunks = new ArrayList<>();

        for (int i = 0; i < images.size(); i += 5) {
            chunks.add(images.subList(i, Math.min(i + 5, images.size())));
        }

        model.addAttribute("imageChunks", chunks);
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signin")
    public String signin() {
        return "signin";
    }

    @GetMapping("/board")
    public String board() {
        return "board";
    }

    @GetMapping("/mypage")
    public String mypage(Model model) {
        File folder = new File("src/main/resources/static/assets/img/performance");
        List<String> images = Arrays.stream(folder.listFiles())
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .collect(Collectors.toList());

        List<List<String>> chunks = new ArrayList<>();

        for (int i = 0; i < images.size(); i += 5) {
            chunks.add(images.subList(i, Math.min(i + 5, images.size())));
        }

        model.addAttribute("imageChunks", chunks);
        return "mypage";
    }

    @GetMapping("/performance")
    public String performance() {
        return "performance-one";
    }

    @GetMapping("/performanceInfo")
    public String performance_Info() {
        return "performanceInfo";
    }

    @GetMapping("/artistInfo")
    public String artistInfo() {
        return "artistInfo";
    }

}