package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.ui.main.listeners;

import android.view.View;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.ui.main.ShoppingListCache;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.ui.main.sort.SortListsDialog;

/**
 * Description:
 * Author: Grebiel Jose Ifill Brito
 * Created: 16.07.16 creation date
 */
public class SortOnClickListener implements View.OnClickListener
{

    private ShoppingListCache cache;

    public SortOnClickListener(ShoppingListCache cache)
    {
        this.cache = cache;
    }

    @Override
    public void onClick(View v)
    {
        SortListsDialog sortListsDialog = new SortListsDialog();
        sortListsDialog.show(cache.getActivity().getFragmentManager(), "SortDialog");
    }
}
