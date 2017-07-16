package com.handicraft.core.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 고승빈 on 2017-07-06.
 */
@Entity(name = "Furniture")
@Table(name = "furniture")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Furniture implements Serializable {

    private static final long serialVersionUID = -3750423939072711694L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "f_id")
    @NonNull
    private int fid;

    private double width;

    private double length;

    private double height;

    private String title;

    private String description;

    private int grade;

    private String manufactureAt;

    private String createAt;

    private List<Integer> tidList;


}
