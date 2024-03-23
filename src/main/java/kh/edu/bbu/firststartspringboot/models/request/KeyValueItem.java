package kh.edu.bbu.firststartspringboot.models.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // default
@AllArgsConstructor
public class KeyValueItem {
    private int id;
    private String key;
    private String value;


}
