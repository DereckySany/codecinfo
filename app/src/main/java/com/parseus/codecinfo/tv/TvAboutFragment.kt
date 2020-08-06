package com.parseus.codecinfo.tv

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.leanback.app.GuidedStepSupportFragment
import androidx.leanback.widget.GuidanceStylist
import androidx.leanback.widget.GuidedAction
import com.parseus.codecinfo.R

class TvAboutFragment : GuidedStepSupportFragment() {

    override fun onCreateGuidance(savedInstanceState: Bundle?): GuidanceStylist.Guidance {
        val title = getString(R.string.about_app)

        val sb = StringBuilder()
        sb.append(getString(R.string.app_version,
                requireActivity().packageManager.getPackageInfo(requireActivity().packageName, 0).versionName)).append('\n')
        sb.append(getString(R.string.copyright)).append('\n')
        sb.append(getString(R.string.source_code_link))
        val description = sb.toString()

        val icon = ContextCompat.getDrawable(requireContext(), R.mipmap.ic_launcher)
        return GuidanceStylist.Guidance(title, description, null, icon)
    }

    override fun onCreateActions(actions: MutableList<GuidedAction>, savedInstanceState: Bundle?) {
        super.onCreateActions(actions, savedInstanceState)
        val okAction = GuidedAction.Builder(requireContext()).title(android.R.string.ok).build()
        actions.add(okAction)
    }

    override fun onGuidedActionClicked(action: GuidedAction) {
        super.onGuidedActionClicked(action)
        finishGuidedStepSupportFragments()
    }

}