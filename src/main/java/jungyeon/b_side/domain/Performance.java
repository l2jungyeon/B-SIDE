package jungyeon.b_side.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class Performance {

    @Id @GeneratedValue
    @Column(name = "performance_id")
    private Long id;

    private String title;
    private String url; //예매 링크
    private LocalDateTime date;
    private String location;
    private String ticketUrl;
    private String cast;
}
