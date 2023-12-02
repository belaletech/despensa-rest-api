package dev.nmarulo.depensaapp.commons.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContentRes<R> {
    
    private List<R> content;
    
}
