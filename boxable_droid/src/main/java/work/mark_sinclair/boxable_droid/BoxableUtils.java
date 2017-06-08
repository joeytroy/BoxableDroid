package work.mark_sinclair.boxable_droid;


import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.font.PDType0Font;

import java.io.IOException;

import work.mark_sinclair.boxable_droid.utils.FontUtils;

/**
 * Created by dgautier on 3/19/2015.
 *
 * @deprecated All methods have been moved elsewhere, see each method for more
 * details
 */
@Deprecated
public class BoxableUtils {

    /**
     * @param document {@link PDDocument} where this {@link PDType0Font} will be applied
     * @param fontPath font's path
     * @return {@link PDType0Font}
     * @throws IOException if font's path is bad
     * @deprecated Use {@link FontUtils#loadFont(PDDocument, String)} instead
     */
    @Deprecated
    public static final PDType0Font loadFont(PDDocument document, String fontPath) throws IOException {
        return PDType0Font.load(document, BoxableUtils.class.getClassLoader().getResourceAsStream(fontPath));
    }
}
