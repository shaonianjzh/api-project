package com.shaonian.apibackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author shaonian
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}