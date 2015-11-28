import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Created by daniel on 11/27/15.
 */
public class JTextFieldLimit extends PlainDocument
{
    private int limit;

    JTextFieldLimit(int limit)
    {
        super();
        this.limit = limit;
    }
    public void insertString (int offset, String str, AttributeSet att) throws BadLocationException
    {
        if (str == null)
        {
            return;
        }
        if (getLength() + str.length() <= limit)
        {
            super.insertString(offset, str, att);
        }
    }
}
