package swiss.sib.swissprot.sjh.attributes.event;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public sealed interface EventAttribute extends Attribute
        permits OnAbort, OnBlur, OnCancel, OnCanPlay, OnCanPlayThrough, OnClick, OnCueChange, OnDblClick,
        OnDurationChange, OnEmptied, OnEnded, OnError, OnFocus, OnInput, OnInvalid, OnKeyDown, OnKeyUp, OnLoad,
        OnLoadedData, OnLoadStart, OnMouseDown, OnMouseEnter, OnMouseOver, OnMouseUp, OnPause, OnPlay, OnPlaying,
        OnProgress, OnRateChange, OnReset, OnResize, OnScroll, OnSeeking, OnSelect, OnShow, OnStalled, OnSubmit,
        OnSuspend, OnTimeUpdate, OnVolumeChange, OnWaiting, OnToggle, OnSeekEnd, OnMouseWheel, OnLoadedMetaData {
}
