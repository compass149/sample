package com.team4project.sample.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardImage implements Comparable<BoardImage>{
    @Id
    private String uuid;
    private String fileName;
    private int ord;
    @ManyToOne
    private Board board;

    @Override
    public int compareTo(BoardImage other) {
        return this.ord - other.ord;
    }
    public void changeBoard(Board board) {
        this.board = board;
    }
}
