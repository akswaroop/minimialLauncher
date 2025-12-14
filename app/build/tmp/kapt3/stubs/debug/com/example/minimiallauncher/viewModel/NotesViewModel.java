package com.example.minimiallauncher.viewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001a"}, d2 = {"Lcom/example/minimiallauncher/viewModel/NotesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/minimiallauncher/model/NotepadRepository;", "(Lcom/example/minimiallauncher/model/NotepadRepository;)V", "_stickyNotes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "<set-?>", "", "noteText", "getNoteText", "()Ljava/lang/String;", "setNoteText", "(Ljava/lang/String;)V", "noteText$delegate", "Landroidx/compose/runtime/MutableState;", "stickyNotes", "Lkotlinx/coroutines/flow/StateFlow;", "getStickyNotes", "()Lkotlinx/coroutines/flow/StateFlow;", "tooglevisibility", "", "show", "updateNote", "newText", "app_debug"})
public final class NotesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.minimiallauncher.model.NotepadRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _stickyNotes = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> stickyNotes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState noteText$delegate = null;
    
    public NotesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.minimiallauncher.model.NotepadRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getStickyNotes() {
        return null;
    }
    
    public final void tooglevisibility(boolean show) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoteText() {
        return null;
    }
    
    private final void setNoteText(java.lang.String p0) {
    }
    
    public final void updateNote(@org.jetbrains.annotations.NotNull()
    java.lang.String newText) {
    }
}