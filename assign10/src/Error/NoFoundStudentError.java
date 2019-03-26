package Error;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error")
public class NoFoundStudentError extends Error {
    @XmlElement(required = true)
    private String error = "Student Not Exist.";

}
