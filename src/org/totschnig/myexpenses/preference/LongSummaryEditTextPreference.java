/*   This file is part of My Expenses.
 *   My Expenses is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   My Expenses is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with My Expenses.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.totschnig.myexpenses.preference;

import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class LongSummaryEditTextPreference extends EditTextPreference
{
    public LongSummaryEditTextPreference(Context ctx, AttributeSet attrs, int defStyle)
    {
        super(ctx, attrs, defStyle);        
    }

    public LongSummaryEditTextPreference(Context ctx, AttributeSet attrs)
    {
        super(ctx, attrs);  
    }

    @Override
    protected void onBindView(View view)
    {       
        super.onBindView(view);

        TextView summary= (TextView)view.findViewById(android.R.id.summary);
        summary.setMaxLines(10);
    }
}