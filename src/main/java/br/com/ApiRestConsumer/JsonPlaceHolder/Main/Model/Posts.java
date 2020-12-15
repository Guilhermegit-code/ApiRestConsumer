package br.com.ApiRestConsumer.JsonPlaceHolder.Main.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import java.io.Serializable;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Posts implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userdId")
    @JsonProperty("userdId")
    Long userId;

    @Column(name = "id")
    @NotNull
    @JsonProperty("id")
    Long id;

    @Column(name = "title")
    @NotNull
    @JsonProperty("title")
    String title;

    @Column(name = "body")
    @NotNull
    @JsonProperty("body")
    String body;

}
