package org.example.hw01.data.dto.request;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class ChangeNameRequestDto {
    private String email;
    private String name;

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "ChangeNameRequestDto(email=" + this.getEmail() + ", name=" + this.getName() + ")";
    }
}
