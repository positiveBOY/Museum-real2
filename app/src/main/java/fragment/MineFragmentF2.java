package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jintong.museum2.R;

/**
 * 显示关注的展览
 * Created by wjc on 2017/2/23.
 */

public class MineFragmentF2 extends Fragment {
    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.mine_fragment_2,container,false);
        return view;
    }
}
