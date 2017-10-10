package com.handicraft.core.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentId implements Serializable{

    private static final long serialVersionUID = -7197870395341385310L;

    long uid;
    long fid;


}