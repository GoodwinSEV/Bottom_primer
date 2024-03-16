package com.example.bottom_primer.ui.four;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.bottom_primer.databinding.FragmentDashboardBinding;
import com.example.bottom_primer.databinding.FragmentFourBinding;
import com.example.bottom_primer.ui.dashboard.DashboardViewModel;

public class FourFragment extends Fragment {
    private FragmentFourBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FourViewModel fourViewModel =
                new ViewModelProvider(this).get(FourViewModel.class);

        binding = FragmentFourBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        fourViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
