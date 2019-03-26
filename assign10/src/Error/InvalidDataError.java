package Error;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.lang.Error;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error")
public class InvalidDataError extends Error {
    @XmlElement(required = true)
    private String error = "Invalid Parameters.";

}
