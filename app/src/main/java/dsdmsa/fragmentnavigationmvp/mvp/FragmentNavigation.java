package dsdmsa.fragmentnavigationmvp.mvp;


import dsdmsa.fragmentnavigationmvp.fragment.BaseFragment;

/**
 * Created by dsdmsa on 4/8/17.
 */

public interface FragmentNavigation {
    interface View {
        void atachPresenter(Presenter presenter);

        void addFragment(BaseFragment fragment);
    }

    interface Presenter {
        void addFragment(BaseFragment fragment);
    }
}
